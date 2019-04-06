package ar.org.natael;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class RoomLayoutGenerator {
	
	private Set<String> bunker1 = ImmutableSet.of(
			"Vieira",
			"El tío",
			"Arielaki",
			"Mausi",
			"Lucardo",
			"Manu",
			"Guido",
			"Eddy",
			"Dieguito");
	private Set<String> bunker2 = ImmutableSet.of(
			"Pablito",
			"Paula",
			"Pagua",
			"Barbi",
			"Nico",
			"Grego",
			"Lea",
			"Negra",
			"Fer R",
			"Facu");
	private Set<String> bialySneh = ImmutableSet.of(
			"Tía",
			"Fernando",
			"Sofi",
			"Raul",
			"Ioje",
			"Victor",
			"Ines",
			"Fabian");
	private Set<String> borbotones = ImmutableSet.of(
			"Slvina",
			"Paloma",
			"Lean",
			"Migue",
			"Eli",
			"Esteban",
			"Sabri",
			"Dami",
			"Leo");
	private Set<String> sirlinPradoBianchi = ImmutableSet.of(
			"Lara",
			"Juan",
			"Caro",
			"Javi P",
			"Mariel",
			"Mia",
			"Flacu",
			"Pitu",
			"Fernanda");
	private Set<String> sirlinYMas = ImmutableSet.of(
			"Fer G E", 
			"Alvi",
			"Patty",
			"Eli",
			"Clelia",
			"Gus",
			"Gladys",
			"Mayco",
			"AUrelio",
			"Javi S");
	private Set<String> puan = ImmutableSet.of(
			"GIse",
			"Chorch",
			"Pela",
			"Yan",
			"Gis",
			"Migue",
			"Inu",
			"Meli");
	private Set<String> aletheiaPellegrini = ImmutableSet.of(
			"Cami",
			"Caro M T",
			"Xavi",
			"Pabluzzi",
			"Quim",
			"Paula VS",
			"Gus S",
			"Barb P",
			"Pablo R",
			"Merce C F",
			"Javi R");
	private Set<String> barreraOros = ImmutableSet.of(
			"Esteban",
			"Gabriel",
			"Clemencia",
			"Carlos",
			"Osvaldo",
			"Aurora",
			"Benja",
			"Tio Martín",
			"Sandra");
	private Set<String> coro = ImmutableSet.of(
			"Elvira",
			"Silvia",
			"Ernesto",
			"Patricia V",
			"Alejandra G",
			"Claudia",
			"Claudio G",
			"María Ines Mori",
			"Marcela B",
			"Domingo",
			"Miriam S");
	private Set<String> judicial = ImmutableSet.of(
			"Claudio F",
			"Rodolfo S",
			"Patricia G",
			"Abel P",
			"Paola B",
			"Ezequiel C",
			"Fer T",
			"Fernando De Hoyos",
			"Cristina Ramos",
			"Sergio Soccio");
	private Set<String> deCicco = ImmutableSet.of(
			"Giovanna",
			"Horacio",
			"Gabriela",
			"Ariel",
			"Florencia",
			"Enzo",
			"Rita",
			"Juan Carlos",
			"Natalia");
	private Set<String> intelectualesK = ImmutableSet.of(
			"Victoria P",
			"Juan Ritvo",
			"Carola C",
			"ALberto P A",
			"Andrés C",
			"Laura E",
			"Luis Tedesco");
	private Set<String> intelectualesK2 = ImmutableSet.of(
			"Edgardo H",
			"Marcela G",
			"María G",
			"Mario M",
			"Marcela Martinez",
			"Cesar Alvarez",
			"Noemi N",
			"Annelie",
			"Adriana B",
			"Laura R");

	private Set<String> intelectualesK3 = ImmutableSet.of(
			"Masu S",
			"Lili B",
			"Celia N",
			"Gabriel E",
			"Rosa C",
			"Gregorio K",
			"Estela J",
			"Nestor S",
			"Pilar B");
	private Set<String> conicet = ImmutableSet.of(
			"Ismael",
			"Andrea",
			"Adrián",
			"Esposa de Adrián",
			"Fernando Bahr",
			"Susana",
			"Manu T",
			"Estefanía (pareja de Manu)",
			"Nico O");
	
	private Set<String> conicet2 = ImmutableSet.of(
			"JOse G R",
			"Natalia (esposa de Jose)",
			"Débora Jacobi",
			"Matías Pizzi",
			"Ivana Costa",
			"Esposo de Ivana Costa",
			"Pareja de Débora Jacobi");
	private Set<String> primos = ImmutableSet.of(
			"Eze",
			"Belen",
			"Adriana",
			"José",
			"Cristina",
			"Gustavo",
			"Mariana",
			"Valeria",
			"Maximiliano");
	private Set<String> medallia1 = ImmutableSet.of(
			"Catriel",
			"Mati",
			"María",
			"Bauna",
			"Dani",
			"Sonia",
			"FLor",
			"Woda",
			"Diego",
			"Eugenia",
			"Hernán");
		
	private Set<String> medallia2 = ImmutableSet.of(
			"Angie",
			"Ari N",
			"Denise M",
			"Juan Ignacio Algieri",
			"Luqu",
			"Nico A",
			"Hannah",
			"Martín S",
			"Ani");
	
	private List<Set<String>> tables = ImmutableList.of(
			bunker1,
			bunker2,
			bialySneh,
			borbotones,
			sirlinPradoBianchi,
			sirlinYMas,
			puan,
			aletheiaPellegrini,
			barreraOros,
			coro,
			judicial,
			deCicco,
			intelectualesK,
			intelectualesK2,
			intelectualesK3,
			conicet,
			conicet2,
			primos,
			medallia1,
			medallia2);

	
	public static void main(String[] args) {
		new RoomLayoutGenerator().tables.stream()
			.sorted(new Comparator<Set<String>>() {
				
				@Override
				public int compare(Set<String> o1, Set<String> o2) {
					return new Integer(o1.size()).compareTo(new Integer(o2.size()));
				}
			})
			.forEach(table -> System.out.println(table.size()));
	}
}
