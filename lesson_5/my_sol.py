import math

def ex1():
	count = 0;
	for i in xrange(1,1000):
		if i%7==0:
			count += 1
			#print i,
	#print 
	return count
	
def is_prime(n, verbose=False):
	for i in xrange( 2, int(math.sqrt(n))+2 ):
		if n%i==0:
			if verbose:
				print i
			return False
	return True
	
def ex2():
	return is_prime(17399, False) # 127*137
	
def ex3():
	count = 0
	for i  in xrange(100,1000):
		if is_prime(i):
			count += 1
	return count
	
	
print "ex1:", ex1()
print "ex2:", ex2()
print "ex3:", ex3()
