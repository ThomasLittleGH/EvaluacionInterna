-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:8889
-- Tiempo de generación: 15-03-2022 a las 13:58:24
-- Versión del servidor: 5.7.34
-- Versión de PHP: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_nutricion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimentos`
--

CREATE TABLE `alimentos` (
  `id` varchar(2) DEFAULT NULL,
  `nombre` varchar(14) DEFAULT NULL,
  `calorias` varchar(8) DEFAULT NULL,
  `proteinas` varchar(9) DEFAULT NULL,
  `carbohidratos` varchar(13) DEFAULT NULL,
  `vit_a` varchar(5) DEFAULT NULL,
  `vit_c` varchar(5) DEFAULT NULL,
  `vit_d` varchar(5) DEFAULT NULL,
  `vit_k` varchar(5) DEFAULT NULL,
  `fibra` varchar(5) DEFAULT NULL,
  `calcio` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alimentos`
--

INSERT INTO `alimentos` (`id`, `nombre`, `calorias`, `proteinas`, `carbohidratos`, `vit_a`, `vit_c`, `vit_d`, `vit_k`, `fibra`, `calcio`) VALUES
('id', 'nombre', 'calorias', 'proteinas', 'carbohidratos', 'vit_a', 'vit_c', 'vit_d', 'vit_k', 'fibra', 'calcio'),
('1', 'arroz_blanco', '126', '2', '29', '0', '0', '0', '0', '2', '3'),
('2', 'pure', '87', '2', '18', '7', '7', '8', '2', '1.3', '25'),
('3', 'fideos', '137', '5', '25', '6', '0', '0', '0', '1.2', '12'),
('4', 'pan', '49', '2', '9', '0', '0', '0', '0', '4.7', '20'),
('5', 'empanada_queso', '273', '8.92', '20.76', '0', '0', '0', '0', '0.7', '0'),
('6', 'empanada_pino', '437', '13', '54', '0', '0', '0', '0', '0', '0'),
('7', 'lechuga', '18', '1', '3', '370', '18', '0', '174', '1.3', '36'),
('8', 'palta', '160', '2', '8.53', '7', '10', '0', '31', '6.7', '12'),
('9', 'tomate', '22', '0.7', '4', '24', '17.8', '0', '0', '1', '10'),
('10', 'papa_cocida', '93', '2', '21', '0', '13', '0', '0.3', '1.5', '5'),
('11', 'aceituna_verde', '135', '1.15', '5', '25', '0', '0', '16', '4', '121'),
('12', 'cebollla_cruda', '44', '1', '10', '0', '8.1', '0', '0', '2.2', '17'),
('13', 'manzana_fuji', '65', '0.15', '15.5', '0', '0', '0', '0', '2', '6'),
('14', 'durazno', '45', '1', '10', '24', '4.1', '0', '3', '1.5', '4'),
('15', 'pera', '63', '0.4', '15', '1', '4.4', '0', '3.8', '3', '8'),
('16', 'kiwi', '77', '1', '17', '5', '106', '0', '47', '0', '40'),
('17', 'carne_blanca', '160', '32', '0', '0', '0', '0', '0', '0', '6');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
