f :: Int -> [Int] -> [Int]
f n arr = arr >>= replicate n

main :: IO ()
main = getContents >>=
       mapM_ print. (\(n:arr) -> f n arr). map read. words