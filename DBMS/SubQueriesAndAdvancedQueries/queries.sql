SELECT country, SUM(deaths) AS total_deaths
FROM covid_cases
GROUP BY country
HAVING SUM(deaths) > (
    SELECT AVG(deaths)
    FROM covid_cases
);

SELECT DISTINCT country
FROM covid_cases
WHERE country IN (
    SELECT country
    FROM covid_cases
    GROUP BY country
    HAVING MAX(confirmed_cases) > 1000000
);

SELECT report_date, confirmed_cases,
    CASE 
        WHEN confirmed_cases > (
            SELECT COALESCE(MAX(c2.confirmed_cases), 0)
            FROM covid_cases c2
            WHERE c2.state = 'Mumbai'
            AND c2.report_date < c1.report_date
        ) THEN 'Peak'
        ELSE 'Normal'
    END AS wave_status
FROM covid_cases c1
WHERE state = 'Mumbai';

SELECT country, 'Vaccinated' AS status, SUM(vaccinated_people) AS population_count
FROM covid_vaccines
GROUP BY country
UNION
SELECT c.country, 'Unvaccinated' AS status, SUM(c.population - COALESCE(v.vaccinated_people, 0)) AS population_count
FROM covid_cases c
LEFT JOIN covid_vaccines v ON c.country = v.country AND c.report_date = v.report_date
GROUP BY c.country;

SELECT DISTINCT country
FROM covid_deaths
WHERE country NOT IN (
    SELECT DISTINCT country
    FROM covid_cases
);
