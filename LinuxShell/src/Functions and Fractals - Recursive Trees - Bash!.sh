declare -A matrix
read -p "Enter N: " N
rows=63
cols=100

for ((i=0; i<rows; i++)); do
    for ((j=0; j<cols; j++)); do
        matrix[$i,$j]='_'
    done
done

tree() {
    local row=$1
    local col=$2
    local len=$3
    local depth=$4

    if ((depth > 0 && depth <= 5)); then
        for ((i=0; i<len; i++)); do
            matrix[$((row-i)),$col]='1'
            matrix[$((row-len-i)),$((col-i-1))]='1'
            matrix[$((row-len-i)),$((col+i+1))]='1'
        done

        tree $((row-len*2)) $((col-len)) $((len/2)) $((depth-1))
        tree $((row-len*2)) $((col+len)) $((len/2)) $((depth-1))
    fi
}

tree 62 49 16 "$N"

for ((i=0; i<rows; i++)); do
    for ((j=0; j<cols; j++)); do
        printf "%s" "${matrix[$i,$j]}"
    done
    printf '\n'
done
