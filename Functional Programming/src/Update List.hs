f [] = []
f (x:xs) 
    | x >= 0 = [x] ++ f xs
    | otherwise = [(-1)*x] ++ f xs
	
-- f arr = map abs arr

main = do
	inputdata <- getContents
	mapM_ putStrLn $ map show $ f $ map (read :: String -> Int) $ lines inputdata