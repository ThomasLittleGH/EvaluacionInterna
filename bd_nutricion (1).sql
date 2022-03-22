-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:8889
-- Tiempo de generación: 22-03-2022 a las 13:54:59
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
  `id` int(2) NOT NULL,
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
(1, 'arroz_blanco', '63', '1', '14,5', '0', '0', '0', '0', '1', '1,5'),
(2, 'pure', '87', '2', '18', '7', '7', '8', '2', '1,3', '25'),
(3, 'fideos', '137', '5', '25', '6', '0', '0', '0', '1,2', '12'),
(4, 'pan', '29,4', '1,2', '5,4', '0', '0', '0', '0', '2,82', '12'),
(5, 'empanada_queso', '273', '8,92', '20,76', '0', '0', '0', '0', '0,7', '0'),
(6, 'empanada_pino', '437', '13', '54', '0', '0', '0', '0', '0', '0'),
(7, 'lechuga', '5,4', '0,3', '0,9', '111', '5,4', '0', '52,2', '0,39', '10,8'),
(8, 'palta', '128', '1,6', '6,824', '5,6', '8', '0', '24,8', '5,36', '9,6'),
(9, 'tomate', '22', '0,7', '4', '24', '17,8', '0', '0', '1', '10'),
(10, 'papa_cocida', '111,6', '2,4', '25,2', '0', '15,6', '0', '0,36', '1,8', '6'),
(11, 'aceituna_verde', '31,05', '0,2645', '1,15', '5,75', '0', '0', '3,68', '0,92', '27,83'),
(12, 'cebollla_cruda', '44', '1', '10', '0', '8,1', '0', '0', '2,2', '17'),
(13, 'manzana_fuji', '65', '0,15', '15,5', '0', '0', '0', '0', '2', '6'),
(14, 'durazno', '45', '1', '10', '24', '4,1', '0', '3', '1,5', '4'),
(15, 'pera', '63', '0,4', '15', '1', '4,4', '0', '3,8', '3', '8'),
(16, 'kiwi', '61,6', '0,8', '13,6', '4', '84,8', '0', '37,6', '0', '32'),
(17, 'carne_blanca', '160', '32', '0', '0', '0', '0', '0', '0', '6'),
(18, 'salcicha', '275', '15,8', '1,86', '19', '0', '0', '0', '0', '10,04'),
(19, 'carne vacuno', '788', '98,3', '0', '0', '0', '0', '0', '0', '68,5'),
(20, 'jamon', '14', '2,26', '0', '0', '0', '0', '0', '0', '0,6'),
(21, 'leche', '152', '8,14', '11,5', '80', '0', '2,39', '0', '0', '306'),
(22, 'yogurt', '92', '16', '5,68', '1,56', '0', '0', '0', '0', '173'),
(23, 'queso', '32', '2,25', '0,9', '17', '0', '0', '0,129', '0', '67,2'),
(24, 'huevo', '72', '6', '0,5', '90', '0', '49', '0', '0', '24'),
(25, 'mantequilla', '36', '0', '0', '34', '0', '0', '0', '0', '1'),
(26, 'lentejas', '226', '18', '38', '0', '0', '0', '3,37', '15', '38'),
(27, 'porotos', '392', '14', '54', '0', '2,78', '0', '0', '14', '154'),
(28, 'arveja', '40,5', '2,7', '7,25', '19', '20', '0', '12,4', '2,85', '12,5'),
(29, 'cafe', '2,4', '0,2', '0', '0', '0', '0', '0', '0', '4,8'),
(30, 'te', '1', '0', '0', '0', '0', '0', '0', '0', '0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimentos`
--
ALTER TABLE `alimentos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alimentos`
--
ALTER TABLE `alimentos`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
