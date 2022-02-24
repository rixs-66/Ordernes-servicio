-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-02-2022 a las 20:41:04
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbasiscom`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogoprecios`
--

CREATE TABLE `catalogoprecios` (
  `id` int(100) NOT NULL,
  `descripcion` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  `precio` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `catalogoprecios`
--

INSERT INTO `catalogoprecios` (`id`, `descripcion`, `precio`) VALUES
(1, 'REVISIÓN EN SITIO', 400),
(2, 'REVISIÓN ASISCOM', 300),
(3, 'MONITOR LCD + REFACCÓN', 390),
(4, 'MONITOR LED + REFACCIÓN', 690),
(5, 'INSTALACIÓN DE SOFTWARE', 490),
(6, 'LAPTOP SERVICIO MTTO PREVENTIVO', 350),
(7, 'LAPTOP SERVICIO MTTO CORRECTIVO', 590),
(8, 'MTTO IMPRESORA CHICA', 490),
(9, 'MTTO IMPRESORA MEDIANA', 890),
(10, 'MTTO IMPRESORA GRANDE', 1200),
(11, 'MTTO PLOTTER', 2000),
(12, 'LIMPIEZA VIRUS ', 200),
(13, 'INSTALACIÓN DE BATERÍA NOBREAK', 300),
(14, 'RECUPERACIÓN DE INFORMACIÓN', 890),
(15, 'MTTO PROYECTORES', 950),
(16, 'REPARACIÓN PROYECTOR', 1450),
(17, 'REPARACION ELIMINADOR', 350),
(18, 'MTTO PREVENTIVO PC', 450),
(19, 'MTTO CORRECTIVO PC', 790),
(20, 'MTTO PREVENTIVO SERVIDOR', 890),
(21, 'MTTO CORRECTIVO SERVIDOR', 1500),
(22, 'CLONACION DE INFORMACIÓN', 450),
(23, 'INSTALACION DE HARDWARE', 150);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `direccion` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `telefono` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `correo` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `numE` int(100) NOT NULL,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pass` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `correo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `perfil` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `numE`, `nombre`, `telefono`, `pass`, `correo`, `perfil`) VALUES
(1, 0, 'ADMIN', NULL, 'Admin123++', '', 'Administrador'),
(2, 0, 'Ricardo', '', 'rica123++', 'rica_66@hotmail.es', 'Técnico'),
(3, 0, 'Mary', '', 'mary123++', 'facturas@asiscom.com.mx', 'Recepción'),
(4, 0, 'Daniel', '', 'daniel123++', 'servicios@asiscom.com.mx', 'Técnico'),
(5, 0, 'Emiliano', '', 'emiliano123++', 'servicios@asiscom.com.mx', 'Técnico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `os`
--

CREATE TABLE `os` (
  `NumOs` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `FechaIngreso` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `FechaSalida` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `EmitidaPor` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TecnicoAsignado` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NombreCliente` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `DireccionCliente` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TelefonoCliente` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `CorreoCliente` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TipoDispositivo` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MarcaDispositivo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Modelo` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `NumSerie` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Contraseña` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Accesorios` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Observaciones` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ReporteCliente` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Estatus` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `EstatusPago` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Total` int(10) DEFAULT NULL,
  `Seguimiento` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `os`
--

INSERT INTO `os` (`NumOs`, `FechaIngreso`, `FechaSalida`, `EmitidaPor`, `TecnicoAsignado`, `NombreCliente`, `DireccionCliente`, `TelefonoCliente`, `CorreoCliente`, `TipoDispositivo`, `MarcaDispositivo`, `Modelo`, `NumSerie`, `Contraseña`, `Accesorios`, `Observaciones`, `ReporteCliente`, `Estatus`, `EstatusPago`, `Total`, `Seguimiento`) VALUES
('A001', '24-feb-2022', '25-feb-2022', 'Mary', 'Ricardo', 'DIego', '', '4111039913', '', 'Laptop', 'Dell', 'Alienware', '123aad', '', '', '123', '123', 'En proceso', 'No Pagado', 0, 'Hola mundo\nHola mundo\nHola mundo\nHola mundo\nHola mundo\nHola mundo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `ID` int(100) NOT NULL,
  `numOs` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Servicio` varchar(80) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Precio` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `catalogoprecios`
--
ALTER TABLE `catalogoprecios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `os`
--
ALTER TABLE `os`
  ADD PRIMARY KEY (`NumOs`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `servicios_ibfk_1` (`numOs`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `catalogoprecios`
--
ALTER TABLE `catalogoprecios`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `servicios_ibfk_1` FOREIGN KEY (`numOs`) REFERENCES `os` (`NumOs`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
