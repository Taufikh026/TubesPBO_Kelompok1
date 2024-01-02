-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2024 at 02:02 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubespbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `logindosen`
--

CREATE TABLE `logindosen` (
  `NIDN` varchar(50) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logindosen`
--

INSERT INTO `logindosen` (`NIDN`, `USERNAME`, `PASSWORD`) VALUES
('DS001', 'taufik', 'taufik123'),
('DS002', 'taufik1', 'taufik1234');

-- --------------------------------------------------------

--
-- Table structure for table `loginmahasiswa`
--

CREATE TABLE `loginmahasiswa` (
  `NIM` varchar(50) NOT NULL,
  `USERNAME` varchar(100) DEFAULT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginmahasiswa`
--

INSERT INTO `loginmahasiswa` (`NIM`, `USERNAME`, `PASSWORD`) VALUES
('AD001', 'taufik', 'taufik123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logindosen`
--
ALTER TABLE `logindosen`
  ADD PRIMARY KEY (`NIDN`);

--
-- Indexes for table `loginmahasiswa`
--
ALTER TABLE `loginmahasiswa`
  ADD PRIMARY KEY (`NIM`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
