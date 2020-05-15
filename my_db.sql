-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2020 at 11:17 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `my_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `complaints`
--

CREATE TABLE `complaints` (
  `reference` varchar(200) NOT NULL,
  `body` varchar(200) NOT NULL,
  `time` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `complaints`
--

INSERT INTO `complaints` (`reference`, `body`, `time`) VALUES
('Password Reset', 'I would Like to reset my password', '2020/03/01 20:52:25'),
('Course Registration Isssues', 'I cant register my courses', '2020/03/01 21:05:59'),
('Other Issues', 'I don\'t have access to my account', '2020/03/03 09:31:48');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'bolu', 'mowumi');

-- --------------------------------------------------------

--
-- Table structure for table `student_data`
--

CREATE TABLE `student_data` (
  `id` int(100) NOT NULL,
  `matric_num` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `entry_mode` varchar(100) NOT NULL,
  `level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_data`
--

INSERT INTO `student_data` (`id`, `matric_num`, `name`, `entry_mode`, `level`) VALUES
(1, 110505004, 'Alex Uke', 'Utme', 400),
(2, 110505010, 'Samuel Otib', 'Utme', 400),
(3, 110505003, 'Pedro Beek', 'Utme', 400),
(4, 110505001, 'Mowumi Teeba', 'Utme', 400),
(5, 110505006, 'Arnold Orlando', 'Utme', 400),
(6, 110505007, 'Bryce Ozie', 'Utme', 400),
(7, 110505008, 'Daniel Dan', 'Utme', 400),
(8, 110505009, 'Marve Adam', 'Utme', 400),
(9, 110505002, 'Ifeoluwa Olami', 'Utme', 400),
(10, 110505012, 'Obi Oma', 'Utme', 400),
(11, 110505020, 'Geshin Thelma', 'Utme', 400);

-- --------------------------------------------------------

--
-- Table structure for table `student_login`
--

CREATE TABLE `student_login` (
  `id` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_login`
--

INSERT INTO `student_login` (`id`, `username`, `password`) VALUES
(1, '110505001', 'thelma'),
(2, '110505002', 'ifeoluwa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_data`
--
ALTER TABLE `student_data`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_login`
--
ALTER TABLE `student_login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `student_data`
--
ALTER TABLE `student_data`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `student_login`
--
ALTER TABLE `student_login`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
