int=1
float=2.0
str="string"
bool=1>2
r=0..5
h={}
a=[int,str]
h[int]=float
res=h[int]
rational = 2r
a=[int,str,rational]

def test_rational(x)
    x = 2r
    return x
end

def dict(db)
    return db["str"]
end
