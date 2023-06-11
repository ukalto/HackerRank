read c

if [[ "$c" == "N" || "$c" == "n" ]]
then
    echo "NO"
elif [[ "$c" == "Y" || "$c" == "y" ]]
then
    echo "YES"
fi
