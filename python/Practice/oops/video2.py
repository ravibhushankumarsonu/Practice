#String Operations
names = ['Jeff', 'Gery', 'Joe', 'Samnta']

#Redabale
# for name in names:
#     #print("Hello there: " + name) #Readable
#     print(' '.join(["Hello there", name]))

# print(','.join(names))
# #Join is preferable when more then two words in a list for two we are using concation


# import os
#
# location_of_files = "location"
# file_name = "example.txt"
#
# with open(os.path.join(location_of_files,file_name)) as f:
#     print(f.read())

who = 'Gary'
how_many = 12

print('{} bought {} apples today'.format(who, how_many))
print('')