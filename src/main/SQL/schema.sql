CREATE TABLE customers(
  customer_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  first_name varChar(255) NOT NULL,
  last_name varChar(255) NOT NULL,
  customer_address varChar(255),
  email varChar(255) NOT NULL UNIQUE
);
CREATE TABLE orders(
  order_id INT AUTO_INCREMENT PRIMARY KEY,
  first_name varChar(255) NOT NULL,
  last_name varChar(255) NOT NULL,
  customer_address varChar(255),
  email varChar(255) NOT NULL UNIQUE
);
CREATE TABLE product(
  product_id INT AUTO_INCREMENT PRIMARY KEY,
  product_name varChar(255),
  product_price DOUBLE NOT NULL
);
CREATE TABLE customer_orders(
  order_id INT NOT NULL,
  FOREIGN KEY(order_id) REFERENCES orders(order_id),
  product_id INT NOT NULL,
  FOREIGN KEY(product_id) REFERENCES product(product_id),
  quantity INT NOT NULL CHECK(quantity > 0)
);