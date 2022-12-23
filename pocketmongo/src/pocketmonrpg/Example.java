package pocketmonrpg;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
			Pocketmon p;
			
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("포켓몬 세계에 오신걸 환영합니다.");
			System.out.println("당신의 포켓몬을 선택하고 모험을 통해 강해지세요!");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			
			System.out.println("포켓몬을 선택하고 번호를 눌러주세요.");
			System.out.println("1. 피카츄");
			System.out.println("2. 파이리");
			System.out.println("3. 꼬부기");
			System.out.println("4. 이상해씨");
			System.out.println("5. 피죤");
			System.out.println("6. 알로라식스테일");
			System.out.println("7. 꼬마돌");
			System.out.println("8. 종료");
			System.out.printf("입력 >> ");
			int choice = sc.nextInt();
			
			// 피카츄 주인공 버전
			if(choice == 1) {
				p = new Pikachu();
				System.out.println("----------------------------------");
				System.out.println("당신은 피카츄를 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			// 파이리 버전
			}else if(choice == 2) {
				p = new Pyri();
				System.out.println("----------------------------------");
				System.out.println("당신은 파이리를 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			
			// 꼬부기 버전
			}else if(choice == 3) {
				p = new Ggobugi();
				System.out.println("----------------------------------");
				System.out.println("당신은 꼬부기를 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			
			// 이상해씨 버전
			}else if(choice == 4) {
				p = new Leesanghaessi();
				System.out.println("----------------------------------");
				System.out.println("당신은 이상해씨를 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			
			// 피죤 버전
			}else if(choice == 5) {
				p = new Pigeon();
				System.out.println("----------------------------------");
				System.out.println("당신은 피죤을 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			
			// 알로라식스테일 버전
			}else if(choice == 6) {
				p = new Allorasixtale();
				System.out.println("----------------------------------");
				System.out.println("당신은 알로라식스테일을 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			
			// 꼬마돌 버전
			}else if(choice == 7) {
				p = new Ggomadoll();
				System.out.println("----------------------------------");
				System.out.println("당신은 꼬마돌을 선택했습니다.");
				p.status();
				System.out.println("----------------------------------");
				System.out.println();
				
				while(true) {
					
					System.out.println("상대할 포켓몬을 선택해주세요.");
					System.out.println("1. 잉어킹 (★초보자 추천★)");;
					System.out.println("2. 이브이");
					System.out.println("3. 뮤츠 (!!위험!!)");
					System.out.println("4. 포켓몬을 종료합니다.");
					System.out.printf("입력 >> ");
					choice = sc.nextInt();
					
					// 잉어킹 선택시
					if(choice == 1) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 잉어킹입니다.");
						Enemyyinguhking eyk = new Enemyyinguhking();
						eyk.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eyk);
								eyk.status();
								if(eyk.hp <= 0) {
									eyk.dead();
									p.getExp(50);
									p.getItem(eyk.itemDrop());
									p.status();
									break;
								}
								eyk.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 이브이 선택시
					if (choice == 2) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 이브이입니다.");
						Enemyeevee eev = new Enemyeevee();
						eev.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(eev);
								eev.status();
								if(eev.hp <= 0) {
									eev.dead();
									p.getExp(75);
									p.getItem(eev.itemDrop());
									p.status();
									break;
								}
								eev.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
					// 뮤츠 선택시
					if(choice == 3) {
						System.out.println("----------------------------------");
						System.out.println("상대할 몬스터는 뮤츠입니다.");
						Enemymewtz emt = new Enemymewtz();
						emt.status();
						while(true) {
							System.out.println("행동을 선택하세요.");
							System.out.println("1. 일반공격");
							System.out.println("2. 궁극기");
							System.out.printf("입력 >> ");
							int bh = sc.nextInt();
							if(bh == 1) {
								System.out.println("일반공격을 시전합니다.");
								p.attack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}
								
							}
							if(bh == 2) {
								System.out.println("궁극기를 시전합니다!");
								p.check_mp(10);
								p.ultimateAttack(emt);
								emt.status();
								if(emt.hp <= 0) {
									emt.dead();
									p.getExp(100);
									p.getItem(emt.itemDrop());
									p.status();
									break;
								}
								emt.attack(p);
								if(p.hp <= 0) {
									p.dead();
									break;
								}							
							}else {
								System.out.println("다시 입력해주세요.");
							}
							
						}	
						
					}
					
				}
			
			
			
			// 프로그램 종료
			}else if(choice == 8) {
				System.out.println("포켓몬 세계에서 멀어집니다...!");
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
				
			// 잘못된 접근방법	
			}else {
				System.out.println("잘못된 입력방식입니다.");
			}
			
			sc.close();
			
		
	}	
	
	
}
		
		
		
		