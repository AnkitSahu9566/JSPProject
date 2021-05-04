    
    function demo()
    {
        b=false;
        b1=false;
        b2=false;
        b3=false;
        rel =/\w{3,30}/;
        
        x=document.getElementById('a').value;
        if(rel.test(x))
        {
            b=true;
        }
        else
        {
            alert("Enter valid name--name must be greater than 3 letters");
        }
        rel1 =/^[A-Za-z]\w{7,14}$/;
        
        x1=document.getElementById('b').value;
        if(rel1.test(x1))
        {
            b1=true;
        }
        else
        {
            alert("password must have first letter of alphabate and greater than 8 letters");
        }
        rel2 =/^\w{3,30}\@\w{5}\.\w{3}$/;
        
        x2=document.getElementById('c').value;
        if(rel2.test(x2))
        {
            b2=true;
        }
        else
        {
            alert("must contain @ and .");
        }
        rel3 =/^\d{10}$/;
        
        x3=document.getElementById('d').value;
        if(rel3.test(x3))
        {
            b3=true;
        }
        else
        {
            alert("enter valid number");
        }
        
        
        
        
        if(b && b1 && b2 && b3)
        {
            
            alert("You Succesfully filled the Form ");
            return true;
        }
        else
        { 
            
            alert("PLease fill valid data ");
            return false;
        }
    } 
     
 
