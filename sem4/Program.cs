// See https://aka.ms/new-console-template for more information




int[] arr = { 1, 4, 6, 8, 0, 3, 5, 7 };
treeBuild(arr);
printNode(treeBuild(arr, 0, arr.Length - 1), "");


static void printNode(Node? node, String sp)
{
    if (node != null)
    {
        Console.WriteLine(sp + node.value);
        printNode(node.right, sp + "R  ");
        printNode(node.left, sp + "L  ");
    }

}



Node? treeBuild(int[] arrN, int counter = 0, int end = 0)
{

    Node? node = null;
    if (counter > end)
    {
        return node;
    }
    int mid = (counter + end) / 2;
    node = new Node(arrN[mid]);
    node.left = treeBuild(arrN, counter, mid - 1);
    node.right = treeBuild(arrN, mid + 1, end);
    return node;
}


public class Node
{
    public Node? left;
    public Node? right;
    public int value { get; set; }
    public Node(int value)
    {
        this.value = value;
    }
}