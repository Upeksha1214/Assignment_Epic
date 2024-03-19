CREATE DATABASE employee;

USE employee;
/////////// table ///////////

SHOW TABLES;

CREATE TABLE Registration (
    employeeCode VARCHAR(15) PRIMARY KEY,
    password VARCHAR(50),
    firstName VARCHAR(100),
    lastName VARCHAR(100),
    address VARCHAR(150),
    NIC VARCHAR(15),
    mobileNo INT,
    gender VARCHAR(15),
    email VARCHAR(150),
    designationMasterData VARCHAR(150),
    profileImage BLOB,
    dateOfBirth DATE,
    Status VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS Login(
        loginId VALUES (20),
        userId VARCHAR(20),
        password VARCHAR(40) NOT NULL DEFAULT 'Unknown'
        PRIMARY KEY(loginId)
        FOREIGN KEY (userId) REFERENCES user(userId)

);

// insert query

INSERT INTO registration (
  employeeCode,
  password,
  firstName,
  lastName,
  address,
  NIC,
  mobileNo,
  gender,
  email,
  designationMasterData,
  profileImage,
  dateOfBirth,
  Status
)
VALUES (
  'EMP123', -- Employee code
  'secure_password', -- Password (hashed or encrypted in a real scenario)
  'John', -- First name
  'Doe', -- Last name
  '123 Main Street', -- Address
  '1234567890', -- NIC number
  1234567890, -- Mobile number
  'Male', -- Gender
  'john.doe@email.com', -- Email
  'Software Engineer', -- Designation
  NULL, -- Profile image (if available)
  '1990-01-01', -- Date of birth
  'Active' -- Status
);
