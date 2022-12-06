import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter User Name :");
        String n = input.nextLine();

        System.out.print("Enter Password to Login : ");
        int p = input.nextInt();
        
        Management m = new Management();
        m.setName("badhon");
        m.setPassword(807);
        String y = m.getName();
        int x = m.getPassword();
        int s = (n.compareTo(y));

        if (p == x && s == 0) {
            m.displayBook();
            Scanner book = new Scanner(System.in);
            System.out.println("Enter Choice : ");
            int ch = book.nextInt();
            System.out.println();
            switch(ch){
                case 1:
                    System.out.println("FOOD BOOKS");
                    System.out.println("--------------------------");
                    System.out.println("1. TakeAway");
                    System.out.println("2. The Timeing Foddie");
                    System.out.println("3. Food for 2");
                    System.out.println("4. I Love My Air Fryer");
                    System.out.println("5. Kitchen Confidential");
                    System.out.println("6. The Man Who Ate Everything");
                    System.out.println("7. Joyce Chen Cook Book");
                    System.out.println("8. The Making of a Chef");
                    System.out.println("9. Down and Out in Paris and London");
                    System.out.println("10. The River Cottage Cookbook");
                    m.payment();
                    break;
                case 2:
                    System.out.println("HISTORY BOOKS");
                    System.out.println("-------------------");
                    System.out.println("1. A Study Under History");
                    System.out.println("2. The Making of The English Working Class");
                    System.out.println("3. The Age of The Revulution");
                    System.out.println("4. The Guns of August");
                    System.out.println("5. 1976");
                    System.out.println("6. Caesar and Christ");
                    System.out.println("7. A History of American People");
                    System.out.println("8. A Life and the Second World War");
                    System.out.println("9. Guns, Germs, and Steel");
                    System.out.println("10. Europe: A History");
                    m.payment();
                    break;
                case 3:
                    System.out.println("SCIENCE FICTION");
                    System.out.println("---------------------------");
                    System.out.println("1. A Desolation Called Peace");
                    System.out.println("2. Sea of Tranquility");
                    System.out.println("3. Eyes of the Void");
                    System.out.println("4. A Prayer for the Crown-Shy");
                    System.out.println("5. The Candy House");
                    System.out.println("6. The School for Good Mothers");
                    System.out.println("7. The Kaiju Preservation Society");
                    System.out.println("8. Dead Silence");
                    System.out.println("9. Tell Me an Ending");
                    System.out.println("10. Goliath");
                    m.payment();
                    break;
                case 4:
                    System.out.println("POLITICKS BOOKS");
                    System.out.println("---------------------------");
                    System.out.println("1. What You Should Know About Politics…But Don’t");
                    System.out.println("2. Fascism: A Warning");
                    System.out.println("3. The Best and the Brightest");
                    System.out.println("4. Team of Rivals: The Political Genius of Abraham Lincoln");
                    System.out.println("5. The Populist Explosion: How the Great Recession Transformed American and European Politics");
                    System.out.println("6. The Populist Explosion: How the Great Recession Transformed American and European Politics");
                    System.out.println("7. Alexander Hamilton");
                    System.out.println("8. Red State, Blue State, Rich State, Poor State: Why Americans Vote the Way They Do’ by Andrew Gelman");
                    System.out.println("9. Why Nations Fail: The Origins of Power, Prosperity, and Poverty");
                    System.out.println("10. All the King’s Men");
                    m.payment();
                    break;
                case 5:
                    System.out.println("NOVEL");
                    System.out.println("---------------------------");
                    System.out.println("1. Anna Karenina");
                    System.out.println("2. To Kill a Mockingbird");
                    System.out.println("3. The Great Gatsby");
                    System.out.println("4. One Hundred Years of Solitude");
                    System.out.println("5. A Passage to India");
                    System.out.println("6. Invisible Man");
                    System.out.println("7. Don Quixote");
                    System.out.println("8. Beloved");
                    System.out.println("9. Mrs. Dalloway");
                    System.out.println("10. Jane Eyre");
                    m.payment();
                    break;
                case 6:
                    System.out.println("Books under Children");
                    System.out.println("---------------------------");
                    System.out.println("1. The Parent Agency");
                    System.out.println("2. The Hunger Games");
                    System.out.println("3. Here Comes Charlie Moon");
                    System.out.println("4. Fungus the Bogeyman");
                    System.out.println("5. The Princess and the Pea");
                    System.out.println("6. Mr Magnolia");
                    System.out.println("7. The Incredible Adventures of Professor Branestawm");
                    System.out.println("8. Tiny");
                    System.out.println("9. A Wrinkle in Time");
                    System.out.println("10. The Recruit");
                    m.payment();
                    break;

            }
            }
        }

    }

