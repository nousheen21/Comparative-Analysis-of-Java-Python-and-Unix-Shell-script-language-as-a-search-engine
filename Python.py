#import Pyton modules
import csv
import sys

#taking input from user
inputData = raw_input('Enter city Name or Date to search\n')

#reading csv file
csv_file = csv.reader(open('data.csv', "rb"), delimiter=",")


#loop through csv list
for row in csv_file:
    #if current row's 1st value is equal to input, print that row
    if (inputData  == row[0]):
        print row
    #if current row's 2nd value is equal to input, print that row
    elif (inputData )== row[1]:
        print row