package Elements;
import java.util.ArrayList;

public class ArrayElements {

	private ArrayList<Element> list = new ArrayList<>();
	
	public ArrayElements() {
		 //1
		list.add(new NonMetals(1, "Hydrogen", "H", "1s1","the Greek 'hydro' and 'genes' meaning water-forming", 1, 's', 1.008, 14.01, 20.28, 0.00008988));
	   //2		
		list.add(new NobleGas(2, "Helium","He", "1s2", "the Greek 'helios' meaning sun", 18, 'p', 4.002602, 0.95, 4.22,.0001785));
	   //3	
		list.add(new AlkaliMetal(3, "Lithium","Li","[He] 2s1", "the Greek 'lithos' meaning stone",1, 's', 6.94, 453.69, 1560, 0.534 ));
	    //4	
		list.add(new AlkalineEarthMetals(4, "Beryllium","Be","[He] 2s2	", "the Greek name for beryl, 'beryllo'", 2 ,'s',9.012182,1560,2742, 1.85 ));
	    //5	
		list.add(new SemiMetals(5, "Boron","B","[He] 2s2 2p1", "the Arabic 'buraq', which was the name for borax", 13, 'p',10.81, 2349, 4200,2.34 ));
	    //6	
		list.add(new NonMetals(6, "Carbon","C","[He] 2s2 2p2", "the Latin 'carbo', meaning charcoal",14, 'p',12.011, 3800, 4300,2.267));		
	    //7	
		list.add(new NonMetals(7, "Nitrogen","N","[He] 2s2 2p3","the Greek 'nitron' and 'genes' meaning nitre-forming", 15, 'p',14.007,63.15, 77.36, 0.0012506));
	    //8	
		list.add(new NonMetals(8, "Oxygen","O", "[He] 2s2 2p4","the Greek 'oxy' and 'genes' meaning acid-forming",16 , 'p',15.999,54.36, 90.20,0.001429 ));
	    //9
		list.add(new Halogen(9, "Fluorine","F","[He] 2s2 2p5","the Latin 'fluere', meaning to flow",17, 'p',18.9984032, 53.53,85.03, 0.001696));
	   //10		
		list.add(new NobleGas(10 , "Neon","Ne", "[He] 2s2 2p6","the Greek 'neos', meaning new",18 , 'p', 20.1797,24.56,27.07, 0.0008999));
	    //11
		list.add(new AlkaliMetal(11, "Sodium","Na","[Ne] 3s1","the English word soda",1 ,'s',22.98976928,370.87,1156,0.971));
	    //12	
		list.add(new AlkalineEarthMetals(12, "Magnesium","Mg","[Ne] 3s2","Magnesia, a district of Eastern Thessaly in Greece", 2 ,'s',24.305, 923, 1363, 1.738));
	    //13	
		list.add(new BasicMetals(13,"Aluminium", "Al","[Ne] 3s2 3p1"," Alumen (Latin, meaning bitter salt)",13, 'p', 26.9815386, 933.47, 2792, 2.698));
	    //14	
		list.add(new SemiMetals(14, "Silicon","Si", "[Ne] 3s2 3p2","the Latin 'silex' or 'silicis', meaning flint",14 , 'p',28.085, 1687, 3538, 2.3296));
	    //15	
		list.add(new NonMetals(15, "Phosphorus","P","[Ne] 3s2 3p3","the Greek 'phosphoros', meaning bringer of light", 15, 'p',30.973762,317.30, 550, 1.82));
	    //16	
		list.add(new NonMetals(16, "Sulfur","S", "[Ne] 3s2 3p4","Either from the Sanskrit 'sulvere', or the Latin 'sulfurium', both names for sulfur",16 , 'p',32.06,388.36, 717.87, 2.067));
	    //17
		list.add(new Halogen(17, "Chlorine", "Cl","[Ne] 3s2 3p5","the Greek 'chloros', meaning greenish yellow",17, 'p', 35.45,171.6, 239.11, 0.003214));
	    //18		
		list.add(new NobleGas(18, "Argon","Ar","[Ne] 3s2 3p6", "the Greek, 'argos', meaning idle", 18, 'p',39.948,83.80, 87.30, 0.0017837));
	    //19 
		list.add(new AlkaliMetal(19, "Potassium","K","[Ar] 4s1", "the English word potash", 1, 's', 39.0983, 336.53, 1032, 0.862));
	    //20	
		list.add(new AlkalineEarthMetals(20, "Calcium","Ca","[Ar] 4s2","the Latin 'calx' meaning lime",2, 's',40.078 ,1115, 1757,1.54 ));	
	    //21
		list.add(new TransitionMetals(21, "Scandium", "Sc","[Ar] 3d1 4s2","Scandinavia",3, 'd',44.955912, 1814, 3109,2.989 ));
	    //22
		list.add(new TransitionMetals(22, "Titanium", "Ti","[Ar] 3d2 4s2","Titans, the sons of the Earth goddess of Greek mythology", 4, 'd',47.867, 1941, 3560, 4.54));
	    //23
		list.add(new TransitionMetals(23, "Vanadium","V", "[Ar] 3d3 4s2","Vanadis, an old Norse name for the Scandinavian goddess Freyja",5, 'd',50.9415, 2183, 3680, 6.11));
	    //24
		list.add(new TransitionMetals(24, "Chromium","Cr","[Ar] 3d5 4s1","the Greek 'chroma', meaning colour",6, 'd',51.9961, 2180, 2944, 7.15));
	    //25
		list.add(new TransitionMetals(25, "Manganese", "Mn","[Ar] 3d5 4s2","from the black magnesium oxide, 'magnesia nigra'", 7, 'd',54.938045,1519, 2334, 7.44));
	    //26
		list.add(new TransitionMetals(26, "Iron", "Fe","[Ar] 3d6 4s2","the Anglo-Saxon name iren",8, 'd',55.845, 1811,3134,7.874 ));
	    //27
		list.add(new TransitionMetals(27 , "Cobalt", "Co","[Ar] 3d7 4s2", "the German word 'kobald', meaning goblin",9, 'd',58.933195, 1768, 3200, 8.86));
	    //28
		list.add(new TransitionMetals(28, "Nickel","Ni","[Ar] 3d8 4s2","the shortened of the German 'kupfernickel' meaning St. Nicholas's copper",10 , 'd',58.6934, 1728, 3186, 8.912));
	    //29
		list.add(new TransitionMetals(29 , "Copper","Cu","[Ar] 3d10 4s1","derived from the Latin 'Cyprium aes', meaning a metal from Cyprus",11, 'd',63.546, 1357.77,2835, 8.96 ));
	    //30
		list.add(new TransitionMetals(30 , "Zinc", "Zn","[Ar] 3d10 4s2","the German, 'zinc', meaning stone",12 , 'd',65.38,692.88, 1180, 7.134 ));
	    //31	
		list.add(new BasicMetals(31 ,"Gallium","Ga","[Ar] 3d10 4s2 4p1", "France",13, 'p',69.723,302.9146, 2477, 5.907 ));
	    //32	
		list.add(new SemiMetals(32, "Germanium","Ge","[Ar] 3d10 4s2 4p2","Germany",14,'p',72.630,1211.40, 3106, 5.323));
	    //33	
		list.add(new SemiMetals(33, "Arsenic","As","[Ar] 3d10 4s2 4p3","the Greek name 'arsenikon' for the yellow pigment orpiment", 15,'p',74.92160, 1090,887,  5.776));
	    //34	
		list.add(new NonMetals(34, "Selenium","Se", "[Ar] 3d10 4s2 4p4", "Moon",16,'p',78.96,453, 958,4.809 ));
	    //35
		list.add(new Halogen(35, "Bromine","Br", "[Ar] 3d10 4s2 4p5	","the Greek 'bromos' meaning stench",17,'p',79.904,265.8,332.0, 3.122 ));
	    //36		
		list.add(new NobleGas(36, "Krypton", "Kr","[Ar] 3d10 4s2 4p6","the Greek 'kryptos', meaning hidden",18, 'p',83.798,115.79, 119.93,0.003733 ));		
	    //37 
		list.add(new AlkaliMetal(37, "Rubidium", "Rb","[Kr] 5s1","the Latin 'rubidius', meaning deepest red",1, 's',85.4678,312.46, 961, 1.532));
	    //38	
		list.add(new AlkalineEarthMetals(38, "Strontium","Sr","[Kr] 5s2", "Strontian, a small town in Scotland",2, 's',87.62,1050,1655, 2.64 ));	
	    //39
		list.add(new TransitionMetals(39, "Yttrium", "Y","[Kr] 4d1 5s2","Ytterby, Sweden",3,'d',88.90585, 1799, 3609,4.469 ));
	    //40
		list.add(new TransitionMetals(40, "Zirconium", "Zr","[Kr] 4d2 5s2","the Persian 'zargun', meaning gold coloured",4,'d',91.224,2128, 4682,  6.506));
	    //41
		list.add(new TransitionMetals(41 , "Niobium","Nb", "[Kr] 4d4 5s1","Niobe, daughter of king Tantalus from Greek mythology",5, 'd',92.90638, 2750, 5017,8.57 ));
	    //42
		list.add(new TransitionMetals(42, "Molybdenum","Mo","[Kr] 4d5 5s1","the Greek 'molybdos' meaning lead",6, 'd',95.96, 2896,4912, 10.22));
	    //43
		list.add(new TransitionMetals(43, "Technetium","Tc","[Kr] 4d5 5s2","the Greek 'tekhnetos' meaning artificial",7, 'd',98, 2430,4538,11.5));
	    //44
		list.add(new TransitionMetals(44, "Ruthenium","Ru","[Kr] 4d7 5s1","Russia",8, 'd',101.07,2607,4423, 12.37));
	    //45
		list.add(new TransitionMetals(45, "Rhodium","Rh", "[Kr] 4d8 5s1","the Greek 'rhodon', meaning rose coloured",9, 'd', 102.90550,2237,3968,12.41));
	    //46
		list.add(new TransitionMetals(46, "Palladium", "Pd","[Kr] 4d10","the then recently-discovered asteroid Pallas, considered a planet at the time",10, 'd',106.42,1828.05,2963, 12.02));
	    //47
		list.add(new TransitionMetals(47, "Silver","Ag","[Kr] 4d10 5s1","the Anglo-Saxon name siolfur",11,'d',107.8682,1234.93, 2435,10.501));
	    //48
	    list.add(new TransitionMetals(48, "Cadmium","Cd","[Kr] 4d10 5s2","the Latin name for the mineral calmine, 'cadmia'",12,'d',112.411,594.22, 1040,8.69));
	    //49	
		list.add(new BasicMetals(49, "Indium","In","[Kr] 4d10 5s2 5p1","the Latin 'indicium', meaning violet or indigo", 13,'p',114.818, 429.75,2345, 7.31));
	    //50
		list.add(new BasicMetals(50 ,"Tin","Sn","[Kr] 4d10 5s2 5p2","the Anglo-Saxon word tin",14,'p',118.710,505.08, 2875,7.287));
	    //51
		list.add(new SemiMetals(51 , "Antimony","Sb", "[Kr] 4d10 5s2 5p3","the Greek 'anti – monos', meaning not alone",15, 'p',121.760,903.78, 1860,6.685));
	    //52	
		list.add(new SemiMetals(52, "Tellurium","Te","[Kr] 4d10 5s2 5p4","Earth, the third planet on solar system",16,'p',127.60, 386.85,457.4, 6.232));
	    //53
		list.add(new Halogen(53, "Iodine","I","[Kr] 4d10 5s2 5p5","the Greek 'iodes' meaning violet",17,'p',126.90447,161.4, 165.03,4.93));
	    //54		
		list.add(new NobleGas(54, "Xenon","Xe", "[Kr] 4d10 5s2 5p6","the Greek 'xenos' meaning stranger",18, 'p',131.293,161.4,165.03,0.005887 ));		
	    //55 
		list.add(new AlkaliMetal(55, "Caesium", "Cs", "[Xe]6s1", "the Latin 'caesius', meaning sky blue",1 , 's' , 132.9054519, 301.59, 944, 1.873));
	    //56
		list.add(new AlkalineEarthMetals(56, "Barium", "Ba", "[Xe]6s2", "the Greek 'barys', meaning heavy", 2, 's', 137.327, 1000, 2170, 3.594));
	    //57
		list.add(new Lanthenide(57, "Lanthanum", "La", "[Xe]5d1 6s2", "the Greek 'lanthanein', meaning to lie hidden", 3, 'd', 138.90547, 1193, 3737, 6.145));
	    //58
		list.add(new Lanthenide(58, "Cerium", "Ce", "[Xe]4f1 5d1 6s2", "Ceres, the Roman God of agriculture", 4, 'f', 140.90765, 1068, 3716, 6.77));
	    //59
		list.add(new Lanthenide(59, "Praseodymium", "Pr", "[Xe]4f3 6s2", "the Greek 'prasios didymos' meaning green twin", 5, 'f', 140.90765, 1208, 3793, 6.773));
	    //60
		list.add(new Lanthenide(60, "Neodymium", "Nd", "[Xe]4f4 6s2", "the Greek 'neos didymos' meaning new twin", 6, 'f' , 144.242, 1297, 3347, 7.007));
	    //61
		list.add(new Lanthenide(61, "Promethium", "Pm", "[Xe]4f5 6s2", "Prometheus of Greek mythology who stole fire from the Gods and gave it to humans",7 , 'f', 145, 1315, 3273, 7.26));
	    //62
		list.add(new Lanthenide(62, "Samarium", "Sm", "[Xe]4f6 6s2", "Samarskite, the name of the mineral from which it was first isolated", 8, 'f', 150.36, 1345, 2067, 7.52));
	    //63
		list.add(new Lanthenide(63, "Europium", "Eu", "[Xe]4f7 6s2", "Europe", 9, 'f', 151.964, 1099, 1802, 5.243));
	    //64
		list.add(new Lanthenide(64, "Gadolinium", "Gd", "[Xe]4f7 5d1 6s2", "Johan Gadolin, chemist, physicist and mineralogist", 10, 'f', 157.25, 1585, 3546, 7.895));
	    //65
		list.add(new Lanthenide(65, "Terbium", "Tb", "[Xe]4f9 6s2", "Ytterby, Sweden", 11, 'f',  158.92535, 1629, 3503, 8.229));
	    //66
		list.add(new Lanthenide(66, "Dysprosium", "Dy", "[Xe]4f10 6s2", "the Greek 'dysprositos', meaning hard to get", 12, 'f', 162.500, 1680, 2840, 8.55));
	    //67
		list.add(new Lanthenide(67, "Holmium", "Ho", "[Xe]4f11 6s2", "Stockholm, Sweden",13 , 'f', 164.93032, 1734, 2993, 8.795));
	    //68
		list.add(new Lanthenide(68, "Erbium", "Er", "[Xe]4f12 6s2", "Ytterby, Sweden",14 , 'f', 167.259, 1802, 3141, 9.066));
	    //69
		list.add(new Lanthenide(69, "Thulium", "Tm", "[Xe]4f13 6s2", "Thule, the ancient name for Scandinavia",15 , 'f', 168.93421, 1818, 2223, 9.321));
	    //70
		list.add(new Lanthenide(70, "Ytterbium", "Yb", "[Xe]4f14 6s2", "Ytterby, Sweden", 16, 'f', 173.054, 1097, 1469, 6.965));
	    //71
		list.add(new Lanthenide(71, "Lutetium", "Lu", "[Xe]4f14 5d1 6s2", "Paris, France",17 , 'f', 174.9668, 1925, 3675, 9.84));
	    //72
		list.add(new TransitionMetals(72, "Hafnium", "Hf", "[Xe]4f14 5d2 6s2", "Copenhagen, Denmark",4 , 'd', 178.49, 2506, 4876, 13.31));
	    //73
		list.add(new TransitionMetals(73, "Tantalum", "Ta", "[Xe]4f14 5d3 6s2", "King Tantalus, father of Niobe from Greek mythology",5 , 'd', 180.94788, 3290, 5731, 16.654));
	    //74
		list.add(new TransitionMetals(74, "Tungsten", "W", "[Xe]4f14 5d4 6s2", "the Swedish 'tung sten' meaning heavy stone", 6, 'd', 183.84, 3695, 5828, 19.25));
	    //75
		list.add(new TransitionMetals(75, "Rhenium", "Re", "[Xe]4f14 5d5 6s2", "Rhine, a river",7 , 'd', 186.207, 3459, 5869, 21.02));
	    //76
		list.add(new TransitionMetals(76, "Osmium", "Os", "[Xe]4f14 5d6 6s2", "the Greek 'osme', meaning smell", 8, 'd', 190.23, 3306, 5285, 22.61));
	    //77
		list.add(new TransitionMetals(77, "Iridium", "Ir", "[Xe]4f14 5d7 6s2", "Iris, the Greek goddess of the rainbow", 9, 'd', 192.217, 2719, 4701, 22.56));
	    //78
		list.add(new TransitionMetals(78, "Platinum", "Pt", "[Xe]4f14 5d9 6s1", "the Spanish 'platina', meaning little silver", 10, 'd', 195.084, 2041.4, 4098, 21.46));
	    //79
		list.add(new TransitionMetals(79, "Gold", "Au", "[Xe]4f14 5d10 6s1", "the Anglo-Saxon word gold", 11, 'd', 196.966569, 1337.33, 3129, 19.282));
	    //80
		list.add(new TransitionMetals(80, "Mercury", "Hg", "[Xe]4f14 5d10 6s2", "Mercury, the first planet in the Solar System", 12, 'd', 200.592, 234.43, 629.88, 13.5336));		
	    //81	
		list.add(new BasicMetals(81, "Thallium", "Tl", "[Xe]4f14 5d10 6s2 6p1", "the Greek 'thallos', meaning a green twig", 13, 'p', 204.38, 577, 1746, 11.85));
	    //82
		list.add(new BasicMetals(82, "Lead", "Pb", "[Xe]4f14 5d10 6s2 6p2", "the Anglo-Saxon lead", 14, 'p', 207.2, 600.61, 2022, 11.342));
	    //83
		list.add(new BasicMetals(83, "Bismuth", "Bi", "[Xe]4f14 5d10 6s2 6p3", "the German 'Bisemutum' a corruption of 'Weisse Masse' meaning white mass", 15, 'p', 208.98040, 544.7, 1837, 9.807));
	    //84
		list.add(new SemiMetals(84, "Polonium", "Po", "[Xe]4f14 5d10 6s2 6p4", "Poland, the native country of Marie Curie, who first isolated the element", 16, 'p', 209, 527, 1235, 9.32));
	    //85
		list.add(new Halogen(85, "Astatine", "At", "[Xe]4f14 5d10 6s2 6p5", "the Greek 'astatos', meaning unstable", 17, 'p', 210, 575, 610, 7));
	    //86	
		list.add(new NobleGas(86, "Radon", "Rn", "[Xe]4f14 5d10 6s2 6p6", "From radium, as it was first detected as an emission from radium during radioactive decay", 18, 'p', 222, 202, 211.3, 0.00973));		
	    //87 
		list.add(new AlkaliMetal(87, "Francium", "Fr", "[Rn]7s1", "France, where it was first discovered", 1, 's', 223, 300, 950, 1.87));
	    //88
		list.add(new AlkalineEarthMetals(88, "Radium", "Ra", "[Rn]7s2", "the Latin 'radius', meaning ray", 2, 's', 226, 973, 2010, 5.5));
	    //89
		list.add(new Actinide(89, "Actinium", "Ac", "[Rn]6d1 7s2", "the Greek 'actinos', meaning a ray", 3, 'd', 227, 1323, 3471, 10.07));
	    //90
		list.add(new Actinide(90, "Thorium", "Th", "[Rn]6d2 7s2", "Thor, the Scandinavian god of thunder", 4, 'f', 232, 2115, 5061, 11.72));	
	    //91
		list.add(new Actinide(91, "Protactinium", "Pa", "[Rn]5f2 6d1 7s2", "the Greek 'protos', as a prefix to the element actinium", 5, 'f', 231.03588, 1841, 4300, 15.37));	
	    //92
		list.add(new Actinide(92, "Uranium", "U", "[Rn]5f3 6d1 7s2", "Uranus, the seventh planet in the Solar System", 6, 'f', 238.02891, 1405.3, 4404, 18.95));
	    //93
		list.add(new Actinide(93, "Neptunium", "Np", "[Rn]5f4 6d1 7s2", "Neptune, the eighth planet in the Solar System", 7, 'f', 237, 917, 4273, 20.45));	
	    //94
		list.add(new Actinide(94, "Plutonium", "Pu", "[Rn]5f6 7s2", "Pluto, a dwarf planet in the Solar System", 8, 'f', 244, 912.5, 3501, 19.84));	
	    //95
		list.add(new Actinide(95, "Americium", "Am", "[Rn]5f7 7s2", "Americas, the continent where the element was first synthesized", 9, 'f', 243, 1449, 2880, 13.69));
	    //96
		list.add(new Actinide(96, "Curium", "Cm", "[Rn]5f7 6d1 7s2", "Pierre Curie, a physicist, and Marie Curie, a physicist and chemist", 10, 'f', 247, 1613, 3383, 13.51));	
	    //97
		list.add(new Actinide(97, "Berkelium", "Bk", "[Rn]5f9 7s2", "Berkeley, California, USA, where the element was first synthesized", 11, 'f' , 247, 1259, 2900, 14.79));	
	    //98
		list.add(new Actinide(98, "Californium", "Cf", "[Rn]5f10 7s2", "State of California, USA, where the element was first synthesized", 12, 'f' , 251, 1173, 1743, 15.1));
	    //99
		list.add(new Actinide(99, "Einsteinium", "Es", "[Rn]5f11 7s2", "Albert Einstein, physicist", 13, 'f', 252, 1133, 1269, 8.84));	
	    //100
		list.add(new Actinide(100, "Fermium", "Fm", "[Rn]5f12 7s2", "Enrico Fermi, physicist", 14, 'f', 257, 1125, 0, 0));	
	    //101
		list.add(new Actinide(101, "Mendelevium", "Md", "[Rn]5f13 7s2", "Dmitri Mendeleyev, chemist and inventor", 15, 'f', 258, 1100, 0, 0));
	    //102
		list.add(new Actinide(102, "Nobelium", "No", "[Rn]5f14 7s2", "Alfred Nobel, chemist, engineer, innovator, and armaments manufacturer", 16, 'f', 259, 1100, 0, 0));	
	    //103
		list.add(new Actinide(103, "Lawrencium", "Lr", "[Rn]5f14 7s2 7p1", "Ernest O. Lawrence, physicist", 17, 'f', 262, 1900, 0,0));	
	    //104
		list.add(new TransitionMetals(104, "Rutherfordium", "Rf", "[Rn]5f14 6d2 7s2", "Ernest Rutherford, chemist and physicist", 4, 'd', 267, 2400, 5800, 23.2));
	    //105
		list.add(new TransitionMetals(105, "Dubnium", "Db", "[Rn]5f14 6d3 7s2", "Dubna, Russia", 5, 'd', 268, 0 ,0, 29.3));
	    //106
		list.add(new TransitionMetals(106, "Seaborgium", "Sg", "[Rn]5f14 6d5 7s2", "Glenn T. Seaborg, scientist", 6, 'd', 269, 0,0, 35.0));
	    //107
		list.add(new TransitionMetals(107, "Bohrium", "Bh", "[Rn]5f14 6d5 7s2", "Hesse, Germany, where the element was first synthesized", 7, 'd', 270,0, 0, 37.1));
	    //108
		list.add(new TransitionMetals(108, "Hassium", "Hs", "[Rn]5f14 6d6 7s2", "Lise Meitner, physicist", 8, 'd', 269, 0, 0, 40.7));
	    //109
		list.add(new TransitionMetals(109, "Meitnerium", "Mt", "[Rn]5f14 6d7 7s2", "Lise Meitner, physicist", 9, 'd', 269, 0,0,37.4));
	    //110
		list.add(new TransitionMetals(110, "Darmstadtium", "Ds", "[Rn]5f14 6d8 7s2", "Darmstadt, Germany, where the element was first synthesized", 10, 'd', 278,0,0,34.8));
	    //111
		list.add(new TransitionMetals(111, "Roentgenium", "Rg", "[Rn]5f14 6d9 7s2", "Nicolaus Copernicus, astronomer", 11, 'd', 281, 0,0, 28.7));
	    //112
		list.add(new TransitionMetals(112, "Copernicium", "Cn", "[Rn]5f14 6d10 7s2", "IUPAC systematic element name",12 , 'd', 285,0,357,23.7));		
	    //113
		list.add(new BasicMetals(113, "Nihonium", "Nh", "[Rn]5f14 6d10 7s2 7p1", "Georgy Flyorov, physicist",13 , 'p', 286, 700, 1400, 16));
	    //114
		list.add(new BasicMetals(114, "Flerovium", "Fl", "[Rn]5f14 6d10 7s2 7p2", "IUPAC systematic element name",14 , 'p', 289, 340, 420, 14));
	    //115
	    list.add(new BasicMetals(115, "Moscovium", "Mc", "[Rn] 5f14 6d9 7s2 7p3", "IUPAC systematic element name",15 , 'p', 290, 0 , 0 ,0));
	    //116
		list.add(new BasicMetals(116, "Livermorium", "Lv", "[Rn] 5f14 6d10 7s2 7p4", "IUPAC systematic element name", 16, 'p', 293, 0 , 0 ,0));
	    //117
		list.add(new Halogen(117, "Tennessine", "Ts", "[Rn] 5f14 6d10 7s2 7p5", "IUPAC systematic element name", 17, 'p', 294, 0 , 0 ,0));
	    //118	
		list.add(new NobleGas(118, "Oganesson", "Og", "[Rn] 5f14 6d10 7s2 7p6", "IUPAC systematic element name", 18, 'p', 294, 0 , 0 ,0));			
	//Initialization Completed
	}

	public ArrayList<Element> getList() {
		return list;
	}

}
