/**
 * class CSCI251ProjFour. Add the following data one by one
 * to a binary search tree, then print out the tree
 * 65, 23, 45, 76, 54, 55, 98, 86 to test your output
 * You may use different data to do it
 * 
 * @author Hongbiao Zeng 
 * @version April 1, 2020
 */
import java.util.Scanner;
public class CSCI251ProjFour
{
    public static void main(String args[]){
        int data;
        int choice;
        Scanner input = new Scanner(System.in);
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
       
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch(choice){
            case 1:
                System.out.print("Enter data that you will add to tree: ");
                data = input.nextInt();
                tree.insert(new Integer(data));
                System.out.println("The tree is: " + tree);
                break;
            case 2: 
                System.out.print("Enter data that you will remove from tree: ");
                data = input.nextInt();
                if(tree.search(data) == null)
                    System.out.println("No such data in tree");
                else{
                    tree.remove(new Integer(data));
                    System.out.println("The tree is: " + tree);
                }
                break;
            case 3:
                System.out.print("Enter data that you want to search for: ");
                data = input.nextInt();
                if(tree.search(data) == null)
                    System.out.println("No such data in tree");
                else
                    System.out.println("The tree is: " + tree + ". Data found in tree");
                break;
            case 4:
                if(tree.isEmpty())
                    System.out.println("Tree is empty");
                else{
                    System.out.println("The tree is: " + tree);
                    System.out.println("Tree size: " + tree.size());
                    System.out.println("Tree height: " + tree.height());
                }
                break;
            case 5:
                System.out.println("Make sure you run enough test before you turn it in");
                break;
            default:
                System.out.println("Wrong option. Please choose from menu");
                break;
            }
        }while(choice != 5);
        
    }
    
    private static void menu(){
        System.out.println("********************");
        System.out.println("*      MENU        *");
        System.out.println("* 1. Add a node    *");
        System.out.println("* 2. Remove a node *");
        System.out.println("* 3. Search a data *");
        System.out.println("* 4. Tree property *");
        System.out.println("* 5. Quit          *");
        System.out.println("********************");
    }
}
/* OUTPUT
 * ********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 20
The tree is: (20(-,-))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 30
The tree is: (20(-,30(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 23
The tree is: (20(-,30(23(-,-),-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 21
The tree is: (20(-,30(23(21(-,-),-),-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 12
The tree is: (20(12(-,-),30(23(21(-,-),-),-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 11
The tree is: (20(12(11(-,-),-),30(23(21(-,-),-),-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 4
The tree is: (20(12(11(-,-),-),30(23(21(-,-),-),-)))
Tree size: 6
Tree height: 3
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 5
Make sure you run enough test before you turn it in

********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 20
The tree is: (20(-,-))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 12
The tree is: (20(12(-,-),-))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 9
Wrong option. Please choose from menu
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 11
The tree is: (20(12(11(-,-),-),-))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 23
The tree is: (20(12(11(-,-),-),23(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 21
The tree is: (20(12(11(-,-),-),23(21(-,-),-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 30
The tree is: (20(12(11(-,-),-),23(21(-,-),30(-,-))))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 2
Enter data that you will remove from tree: 21
The tree is: (20(12(11(-,-),-),23(-,30(-,-))))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 21
The tree is: (20(12(11(-,-),-),23(21(-,-),30(-,-))))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 2
Enter data that you will remove from tree: 12
The tree is: (20(11(-,-),23(21(-,-),30(-,-))))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 4
The tree is: (20(11(-,-),23(21(-,-),30(-,-))))
Tree size: 5
Tree height: 2
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 3
Enter data that you want to search for: 12
No such data in tree
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 5
Make sure you run enough test before you turn it in

********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 40
The tree is: (40(-,-))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 20
The tree is: (40(20(-,-),-))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 50
The tree is: (40(20(-,-),50(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 10
The tree is: (40(20(10(-,-),-),50(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 30
The tree is: (40(20(10(-,-),30(-,-)),50(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 1
Enter data that you will add to tree: 60
The tree is: (40(20(10(-,-),30(-,-)),50(-,60(-,-))))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 2
Enter data that you will remove from tree: 40
The tree is: (50(20(10(-,-),30(-,-)),60(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 4
The tree is: (50(20(10(-,-),30(-,-)),60(-,-)))
Tree size: 5
Tree height: 2
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 3
Enter data that you want to search for: 50
The tree is: (50(20(10(-,-),30(-,-)),60(-,-))). Data found in tree
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 2
Enter data that you will remove from tree: 30
The tree is: (50(20(10(-,-),-),60(-,-)))
********************
*      MENU        *
* 1. Add a node    *
* 2. Remove a node *
* 3. Search a data *
* 4. Tree property *
* 5. Quit          *
********************
Enter your choice: 5
Make sure you run enough test before you turn it in

 */