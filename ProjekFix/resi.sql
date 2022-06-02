-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2022 at 08:23 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `resi`
--

CREATE TABLE `resi` (
  `nomor_resi` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `pengirim` varchar(20) NOT NULL,
  `penerima` varchar(20) NOT NULL,
  `isi` varchar(20) NOT NULL,
  `jumlah` double NOT NULL,
  `berat` double NOT NULL,
  `biaya` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `resi`
--

INSERT INTO `resi` (`nomor_resi`, `tanggal`, `pengirim`, `penerima`, `isi`, `jumlah`, `berat`, `biaya`) VALUES
('asioudhq2', '2022-06-06', 'eggy', 'suhar', 'pempes', 2, 1, 40000),
('nasd9', '2022-08-01', 'aosdn', 'askdjn', 'aksdn', 2, 1, 15000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `resi`
--
ALTER TABLE `resi`
  ADD KEY `Index` (`nomor_resi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
