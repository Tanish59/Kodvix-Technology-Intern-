class queue
{
    int f; int r; int c;
    int q[20];
 queue(int);
public  void add_ele(int){

    f = 0;
    r = -1;
    c = 20;
    {
        for (int i = 0; i < c; i++)
            q[i] = -1;
    }
}
void queue::add_ele(int d)
{
    if (r == (c - 1))
    {
        cout << "queue is full \n";
    }
    else
    {
        if (r == -1)
        {
            f = r = 0;
        }
        else
            r++;
        q[r] = d;
}
public void delete_ele();
public  void peek_ele();
public  void display();
}
queue::queue(int v)
{
    // q = new int[v];
  
    }