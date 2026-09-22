//THIS IS THE DRIVER CODE
//DO NOT MAKE ANY CHANGES HERE
import java.util.Objects;
import java.util.Scanner;

public class BinaryTreeTester {

    //DO NOT MAKE ANY CHANGES HERE
    public static void main(String[] args) {
        System.out.println("\nEnter any number between 1 to 8.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
        if( input.equals("5") || input.equals("") ) task5();
        if( input.equals("6") || input.equals("") ) task6();
        if( input.equals("7") || input.equals("") ) task7();
        if( input.equals("8") || input.equals("") ) task8();

        System.out.println(cyan+"\n===================== TheEnd ===================="+endFormat);
    }
    
    public static void task1(){
        Object[] tree;
        BTNode root ;
        taskPrint("\n================ TASK#1_1 ===============");
        // index              0    1   2   3   4   5    6     7 
        tree = new Object[]{ null, 10, 20, 30, 40, 60, null, 50 };
        root = treeConstruction(tree, 1);
        System.out.println("::Given Binary Tree::");
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.print("PreOrder Traversal: ");
        System.out.println("10 20 40 60 30 50");

        System.out.println("::Your Output::");
        System.out.print("PreOrder Traversal: ");
        Task1.preOrder(root);
        System.out.println();

        taskPrint("\n================ TASK#1_2 ===============");
        // index              0    1   2   3   4   5    6     7 
        tree = new Object[]{ null, 10, 20, 30, 40, 60, null, 50 };
        root = treeConstruction(tree, 1);
        System.out.println("::Given Binary Tree::");
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.println("40:2\n" + //
                        "60:2\n" + //
                        "20:1\n" + //
                        "50:2\n" + //
                        "30:1\n" + //
                        "10:0");
        System.out.println("::Your Output::");
        Task1.postOrderLvl(root);
        System.out.println();
        
        taskPrint("\n================ TASK#1_3 ===============");
        // index              0    1   2   3   4   5    6     7 
        tree = new Object[]{ null, 10, 20, 30, 40, 60, null, 50 };
        root = treeConstruction(tree, 1);
        System.out.println("::Given Binary Tree::");
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.println("40:2\n" + //
                        "60:2\n" + //
                        "10:0\n" + //
                        "50:2");
        System.out.println("::Your Output::");
        Task1.inOrderEvenLvl(root);
        System.out.println();
        
        System.out.println("--------------------------------------------------");
        
        System.out.println(normal);
    }
    
    public static void task2(){
        Object[] tree;
        BTNode root;
        taskPrint("\n================ TASK#2 ================");
        taskPrint("========== Count Total Nodes ==========");
        // index              0     1   2  3   4   5   6   7    8     9     10    11    12    13   14  15
        tree = new Object[]{ null, 10, 30, 20, 50, 90, 70, 80, null, null, null, null, null, null, 30, 40};
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("--------------------------------------------------");
        System.out.println("::Expected Output::");
        System.out.println("Number of Nodes: 9");

        System.out.println("::Your Output::");
        int totalNodes = Task2.countNodes(root);
        System.out.println("Number of Nodes: "+totalNodes);
        System.out.println(normal);
    }
    
    public static void task3(){
        Object[] tree;
        BTNode root;
        taskPrint("========= Summation of Nodes =========");
        taskPrint("\n============= TASK#3_1 =============");
        // index              0     1   2  3   4   5   6   7    8     9     10    11    12    13   14  15
        tree = new Object[]{ null, 10, 30, 20, 50, 90, 70, 80, null, null, null, null, null, null, 30, 40};
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.println("420");
        System.out.println("::Your Output::");
        Integer x = Task3.sumTree(root);
        System.out.println(x);

        taskPrint("\n============= TASK#3_2 =============");
        // index              0     1   2  3   4   5   6   7    8     9     10    11    12    13   14  15
        tree = new Object[]{ null, 10, 30, 20, 50, 90, 70, 80, null, null, null, null, null, null, 30, 40};
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.println("420");
        System.out.println("::Your Output::");
        Task3.sumTreePrint(root);

        System.out.println(normal);
    }
    
    public static void task4(){
        Object[] tree;
        BTNode root;
        taskPrint("========== Summation of Nodes ==========");
        taskPrint("\n=============== TASK#4 ===============");
        // index              0     1   2  3   4   5   6   7    8     9     10    11    12    13   14  15
        tree = new Object[]{ null, 10, 30, 20, 50, 90, 70, 80, null, null, null, null, null, null, 30, 40};
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.println("50 90 70 30 40");
        System.out.println("::Your Output::");
        Task4.printLeafNodes(root);

        System.out.println(normal);
    }

    public static void task5(){
        Object[] tree;
        BTNode root;
        taskPrint("============ Max of Tree ============");
        taskPrint("\n============== TASK#5 ==============");
        // index              0     1   2  3   4   5   6   7    8     9     10    11    12    13   14  15
        tree = new Object[]{ null, 10, 30, 20, 50, 90, 70, 80, null, null, null, null, null, null, 30, 40};
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("::Expected Output::");
        System.out.println("90");
        System.out.println("::Your Output::");
        Integer x = Task5.maxTree(root);
        System.out.println(x);

        System.out.println(normal);
    }

    public static void task6(){
        Object[] tree;
        BTNode root;
        String task = "TASK#6";
        taskPrint("\n===================== "+task+" =====================");
        taskPrint("============== Subtraction of Nodes ==============");
        // index              0   1   2   3   4   5   6   7  8   9   10    11    12    13    14  15
        tree = new Object[]{null, 71, 27, 62, 80, 75, 41, 3, 87, 56, null, null, null, null, 19, 89 };
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("--------------------------------------------------");
        System.out.println("::Expected Output::");
        System.out.println("111");
        Integer returnedInteger = Task6.subtractSummation(root);
        System.out.println(bold+"\n::Your Output::");
        System.out.println(returnedInteger);
        
        if( Objects.equals(returnedInteger, 111) ) successPrint("Task#5");
        else failedPrint("Task#5");
        System.out.println(normal);
    }
    
    public static void task7(){
        Object[] tree;
        BTNode root;
        String task = "TASK#7";
        taskPrint("\n===================== "+task+" ======================");
        taskPrint("============= Difference of Level Sum =============");
        // index              0   1  2  3  4   5    6  7   8     9      10   11  12  13  14    15 
        tree = new Object[]{null, 1, 2, 3, 4, null, 5, 6, null, null, null, null, 7, 8, null, null};
        root = treeConstruction(tree, 1);
        BTPrinter.printNode(root);
        System.out.println("--------------------------------------------------");
        System.out.println("::Expected Output::");
        System.out.println("4");
        Integer returnedInteger = Task7.levelSum(root);
        System.out.println(bold+"\n::Your Output::");
        System.out.println(returnedInteger);
        
        if( Objects.equals(returnedInteger, 4) ) successPrint(task);
        else failedPrint(task);
        
    }

    public static void task8(){
        Object[] tree;
        BTNode givenRoot, expectedRoot;
        String task = "TASK#8";
        taskPrint("\n===================== "+task+" =====================");
        taskPrint("============== Swap Children Nodes ===============");
        // index              0    1    2    3    4    5    6     7    8    9   10    11    12   13     14
        tree = new Object[]{null, 'A', 'B', 'C', 'D', 'E', null, 'F', 'G', 'H', 'I', null, null, null, 'J' };
        givenRoot = treeConstruction(tree, 1);
        BTPrinter.printNode(givenRoot);
        System.out.println("--------------------------------------------------");
        // index              0    1    2    3    4    5     6    7    8    9    10    11    12   13    14   15
        tree = new Object[]{null, 'A', 'C', 'B', 'F', null, 'E', 'D', 'J', null, null, null, 'I', null, 'G', 'H' };
        expectedRoot = treeConstruction(tree, 1);
        System.out.println("::Expected Output Tree::");
        BTPrinter.printNode(expectedRoot);        
        
        System.out.println(bold+"\n::Your Binary Tree::");
        Task8.swapChild(givenRoot, 0, 2);
        BTPrinter.printNode(givenRoot);
        
        if( isTreeEqual(expectedRoot, givenRoot) ) successPrint(task);
        else failedPrint(task);
        System.out.println(normal);
    }
    
    private static BTNode treeConstruction( Object[] arr, int i ){
        if (i>=arr.length || arr[i]==null)
        return null;
        BTNode p = new BTNode(arr[i]);
        p.left = treeConstruction(arr, 2*i);
        p.right = treeConstruction(arr, 2*i+1);
        return p;
    }
    
    
    private static int getDepth( BTNode root ){
        return getDepthHelper(root,0);
    }
    
    private static int getDepthHelper( BTNode root, int lvl ){
        if( root==null){
            return lvl;
        }
        int leftLvl = getDepthHelper(root.left, lvl+1);
        int rightLvl = getDepthHelper(root.right, lvl+1);
        
        return leftLvl>rightLvl ? leftLvl: rightLvl;
    }
    
    private static boolean isTreeEqual( BTNode root1, BTNode root2  ){
        
        if(root1==null && root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1!=null && root2==null) return false;
        //if elements didn't match
        if( !Objects.equals(root1.elem, root2.elem) ){
            return false;
        } 
        boolean left = isTreeEqual(root1.left, root2.left);
        boolean right = isTreeEqual(root1.right, root2.right);
        return left && right; 
    }
    
    private static boolean isArrEqual(Object[] arr1, Object[] arr2){
      if(arr1.length!=arr2.length) return false;
      else{
        for(int i=0; i<arr1.length; i++)
          if( !Objects.equals(arr1[i],arr2[i]) ) return false;
        return true;
      }
    }
    
    private static void printArr(Object[] arr){
        if(arr==null){
            System.out.println("null");
            return;
        }
        System.out.print("{ ");
        for(int i=0; i<arr.length; i++){
            System.out.print( "Lvl("+i+"): "+arr[i]);
            if (i!=arr.length-1)
            System.out.print(", ");
        }
        System.out.println(" }");
    }
    
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";
    
    static String taskFormat = cyan;
    static String sucsFormat = "\n"+green+bold+underline;
    static String failFormat = "\n"+red+bold+underline;
    static String endFormat = normal+white;

    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }

    private static void successPrint(String task){
            System.out.println(sucsFormat+"    "+task+" Success!! Output Matched!!!     "+endFormat);
    }
    
    private static void failedPrint(String task){
        System.out.println(failFormat+"    "+task+" Failed!! Output didn't Match!!!   "+endFormat);
    }
    
}
