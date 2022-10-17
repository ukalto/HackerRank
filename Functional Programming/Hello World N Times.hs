{-# LANGUAGE FlexibleInstances, UndecidableInstances, DuplicateRecordFields #-}

module Main where

import Control.Monad
import Data.Array
import Data.Bits
import Data.List
import Data.List.Split
import Data.Set
import Debug.Trace
import System.Environment
import System.IO
import System.IO.Unsafe

printNTimes :: Int -> String
printNTimes 1 = "Hello World"
printNTimes n = "Hello World\n" ++ printNTimes (n-1)

-- hello_worlds n = putStrLn $ Data.List.foldr (++) "" ["Hello World\n" | _ <- [1..n]]

main :: IO()
main = do
    n <- readLn :: IO Int
    putStrLn(printNTimes n)