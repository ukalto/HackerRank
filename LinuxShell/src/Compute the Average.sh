read n
sum=0

for ((i=0; i<n; i++)); do
    read num
    sum=$((sum + num))
done

average=$(bc -l <<< "scale=4; $sum / $n")
printf "%.3f\n" $average
