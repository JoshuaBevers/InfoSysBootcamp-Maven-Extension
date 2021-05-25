CREATE DATABASE school;
Create TABLE students(
  student_id PRIMARY KEY NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  age INT NOT NULL
);
CREATE TABLE enrollment(
  erollment_id PRIMARY KEY NOT NULL AUTO_INCREMENT,
  student_id INT NOT NULL,
  FOREIGN KEY(student_id) REFERENCES students(student_id),
  class_id INT NOT NULL,
  FOREIGN KEY(class_id) REFERENCES classes(class_id)
);
CREATE TABLE classes(
  class_id PRIMARY KEY NOT NULL AUTO_INCREMENT,
  class_subject VARCHAR(255) NOT NULL,
  descrip VARCHAR(255),
  lvl INT
);