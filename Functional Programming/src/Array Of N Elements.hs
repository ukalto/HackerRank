fn :: Int -> [Int]
fn n = [0,1..(n-1)]

main = do
n <- readLn :: IO Int
print (fn(n))