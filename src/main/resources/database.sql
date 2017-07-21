-- Table: users
CREATE TABLE hotel_booking (
  id       BIGINT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  hotel_name VARCHAR(255) NOT NULL,
  nb_of_nights INT NOT NULL,
  price_per_night DOUBLE NOT NULL
)
  ENGINE = InnoDB;

-- Insert data proselyte 12345678

INSERT INTO hotel_booking VALUES (1, 'avrora', 3 , 33.5);
INSERT INTO hotel_booking VALUES (2, 'name2', 1 , 343.99);
INSERT INTO hotel_booking VALUES (3, 'name3', 2 , 353.1);
INSERT INTO hotel_booking VALUES (4, 'name4', 3 , 120.54);
