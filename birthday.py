import time 
from random import randint

for i in range(1,45):
    print('')

s = ''

for i in range(1,1000):
    count = randint(1,1000)
    while (count > 0):
       s += ''          
       count -= 1

    if(i%10==0):
        print(s + '🥰🥰🥰🥰🥰🥰  🌹💗HAPPY BIRTHDAY🥳❤️🌹 🥰🥰🥰🥰')
    else:
        print(s +  '🌹HAPPY BIRTHDAY  💐  💐    🌹HAPPY BIRTHDAY    🌹    🍦    🍿  HAPPY BIRTHDAY  🎂    🍫   😎')
        
        s = ''
        time.sleep(0.1)
        
        
