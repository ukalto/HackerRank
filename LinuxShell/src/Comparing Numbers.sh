read x
read y

if [ "$y" -gt "$x" ]
then
    echo "X is less than Y"
elif [ "$y" -lt "$x" ]
then
    echo "X is greater than Y"
else
    echo "X is equal to Y"
fi
