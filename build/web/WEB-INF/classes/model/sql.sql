SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

-- Database: `exemplo_mvc_crud_jdbc`
CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `telefone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Indexes for table `pessoa`
ALTER TABLE `pessoa`   ADD PRIMARY KEY (`id`);

ALTER TABLE `pessoa`   
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
