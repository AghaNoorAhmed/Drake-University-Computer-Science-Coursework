#Student: Agha Noor Ahmed Khan
#Class: CS66 - Introduction to Computer Science II
#Instructor: Dr. Andrei Migunov
#Assignment: Infinite Monkey
#Score: 8/8, 100%

import random

def random_letter():
    alphabet = "abcdefghijklmnopqrstuvwxyz "
    return alphabet[random.randint(0, 26)]
def random_text(length):
    random_string = ""
    for _ in range(length):
        random_string += random_letter()
    return random_string
def score(text1, text2):
    count = 0
    for i in range(len(text1)):
        if text1[i] == text2[i]:
            count += 1
    return count
def monkey_experiment(goal_string, iterations):
    best_score = -1
    best_text = ""  
    for _ in range(iterations): 
        random_string = random_text(len(goal_string))
        current_score = score(random_string, goal_string)
        if current_score > best_score: 
            best_score = current_score 
            best_text = random_string
    return best_text, best_score  

'''
#testing
print(monkey_experiment("methinks it is like a weasel",100000))
print(monkey_experiment("methinks it is like a weasel",100))
print(monkey_experiment("brevity is the soul of wit",100000))
print(monkey_experiment("to be",100000))
print(monkey_experiment("to be",200000))
print(monkey_experiment("to be",500000))

#displayed below are the results
('zetmiumnhivriijdizq ftdcr rh', 7)
('mcegmucc nrewfdjismow nfbvka', 4)
('krjtijythxkrjeesou dia fli', 8)
('ho bg', 3)
('bo bw', 3)
('to se', 4)
'''