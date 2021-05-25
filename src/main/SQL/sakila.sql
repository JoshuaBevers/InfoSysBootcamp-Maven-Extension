-- SOlutions to Pawel task at 10:00 am 5/13/2021

-- 9. Find the titles of all the horror movies.
SELECT f.title, c.name FROM film_category fc JOIN category c ON fc.category_id = c.category_id JOIN film f ON f.film_id = fc.film_id WHERE fc.category_id = 11;

-- Bonus Examples
--  List the name of every language in reverse-alphabetical order. (HINT: use 'ORDER BY' and 'SELECT DISTINCT')
SELECT * FROM language ORDER BY language_id DESC;
-- List the full names of every actor whose surname ends with '-son' in alphabetical order by their forename (HINT: use %son%)
SELECT * FROM actor WHERE last_name LIKE '%son%' ORDER BY last_name DESC;
-- Using HAVING COUNT, reverse-alphabetically list the last names that are not repeated.
SELECT a.last_name, COUNT(*) FROM actor a GROUP BY a.last_name HAVING COUNT(*) = 1;
-- Which actor has appeared in the most films? (HINT: use joins, COUNT() and GROUP BY)

