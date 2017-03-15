def foo(x)
    if x>2
        y=1
    else
        y="1"
    end
    
end


#?->[int] should be ?->[?]
def f(x,y)
    return 1,y
end


def fac(x)
    if x==1
        y=1
    else
        y=x*fac(x-1)
    end
end

def rec(x)
    if x==0
        y=["a"]
    else
        y=[rec(x-1)]
    end
end


def bar(x)
    foo(x)
end