SET SQL_MODE = "NO_AUTO_VALUE_ON_pokemonZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- -----------------------------------------------------
-- Schema PokemonManagement
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `PokemonManagement` ;

-- -----------------------------------------------------
-- Schema PokemonManagement
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PokemonManagement` DEFAULT CHARACTER SET utf8 ;
USE `PokemonManagement` ;

-- -----------------------------------------------------
-- Table `PokemonManagement`.`Pokemon`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PokemonManagement`.`pokemon` ;

CREATE TABLE IF NOT EXISTS `PokemonManagement`.`pokemon` (
  `id_pokemon` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45),
  `experience` INT(4),
  `height` INT(3),
  `weight` INT(3)
  PRIMARY KEY (`id_pokemon`))
ENGINE = InnoDB;

--
-- AUTO_INCREMENT table `pokemon`
--
ALTER TABLE `pokemon`
  MODIFY `id_pokemon` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;


--
-- INSERT VALUES table `pokemon`
--
INSERT INTO `pokemon` (`id_pokemon`, `name`, `type`, `experience`, `height`, `weight`) VALUES
(1, 'Pikachu', 'Fire', 750, 20, 45),
(2, 'Rich', 'Air', 520, 21,50),
(3, 'Nidorina', 'Water', 250, 20,55),
(4, 'Pidgeot', 'Fire', 528, 10, 30),
(5, 'Kakuna', 'Air', 410, 40, 45),
(6, 'Butterfree', 'Air', 818, 60, 51),
(7, 'Venusaur', 'Fire', 155, 24, 69),
(8, 'Charmander', 'Fire', 785, 22, 25),
(9, 'Squirtle', 'Water', 465, 36, 68),
(10, 'Blastoise', 'Earth', 635, 80, 125),
(11, 'Pidgey', 'Air', 962, 15, 31),
(12, 'Nidoking', 'Fire', 637, 120, 245),
(13, 'Clefable', 'Water', 521, 25, 36),
(14, 'Vulpix', 'Air', 425, 36, 98),
(15, 'Venomoth', 'Fire', 425, 58, 47),
(16, 'Diglett', 'Water', 412, 36, 14),
(17, 'Gloom', 'Earth', 221, 68, 125),
(18, 'Vileplume', 'Fire', 559, 32, 14),
(19, 'Meowth', 'Earth', 158, 10, 24),
(20, 'Dugtrio', 'Air', 514, 154, 260),
(21, 'Golduck', 'Water', 658, 23, 82),
(22, 'Arcanine', 'Air', 745, 68, 97),
(23, 'Abra', 'Fire', 456, 68, 162),
(24, 'Kadabra', 'Fire', 665, 235, 324),
(25, 'Machamp', 'Water', 288, 140, 182);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;









