public class CsClassSol {
    void solve()
{


int arr[] = {1,9,0};

//int max = getMax(arr);

int n =3;

for( int i =0 ; i < 9 ; i++)
{
for(int j =0 ; j < n ; j++)
{

if(arr[j] > 0 )
{
cout<<"* "; //SOP("* ")
arr[j]--;
}
else
{
cout<<" ";
}


}
cout<<endl; // SOP('/n');
}



}
}
