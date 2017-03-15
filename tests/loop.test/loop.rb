i = 0
num = 5
 
while i < num  do
   i +=1
end
num=i

while i < num  do
   i =[i]
end
num=i

def foo(x)
    num=5
    x=1
    while x<num do
        x=[x]
    end
end