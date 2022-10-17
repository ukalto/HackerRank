f arr = foldr (+) 0 (filter odd arr)
-- f = sum . filter odd

main = do
	inputdata <- getContents
	putStrLn $ show $ f $ map (read :: String -> Int) $ lines inputdata