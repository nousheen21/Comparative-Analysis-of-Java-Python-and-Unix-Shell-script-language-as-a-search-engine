#!/bin/hash

echo "Enter city Name or Date to search\n"

#take input from user
read string

while IFS= read -r data
do
  if [[ $data = *$string* ]]
  then
   echo $data
 fi
done < data.csv
