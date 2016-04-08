package BinaryTree;

/**
 * Created by Wu on 4/2/2016.
 */
public class BinaryTree
{
    Node root;

    public BinaryTree(int value)
    {
        root = new Node(value);
    }

    public void addNewNode(int value)
    {
        Node focusNode = root;
        if(focusNode == null)
        {
            focusNode = new Node(value);
        }
        else
        {
            while(true)
            {
                if(value < focusNode.getValue())
                {
                    if (focusNode.getLeftChild() != null)
                    {
                        focusNode = focusNode.getLeftChild();
                    }
                    else
                    {
                        focusNode.addLeftChild(new Node(value));
                        break;
                    }
                }
                else if (value > focusNode.getValue())
                {
                    if(focusNode.getRightChild() != null)
                    {
                        focusNode = focusNode.getRightChild();
                    }
                    else
                    {
                        focusNode.addRightChild(new Node(value));
                        break;
                    }
                }
            }
        }
    }

    public Node getRootNode()
    {
        return this.root;
    }

    public void inOrderTraverseTree(Node focusNode)
    {
        if(focusNode != null)
        {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode.getValue());
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preorderTraverseTree(Node focusNode)
    {
        if(focusNode != null)
        {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode)
    {
        if(focusNode != null)
        {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree(50);
        tree.addNewNode(40);
        tree.addNewNode(70);
        tree.addNewNode(60);
        tree.addNewNode(30);

        tree.inOrderTraverseTree(tree.getRootNode());
    }
}
