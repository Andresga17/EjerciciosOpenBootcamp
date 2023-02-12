//condición ? expr1 : expr2
const fibonacci = (limit) => {

    let f0 = 0
    let f1 = 1
    let arrayfn = [0]

    for (let i = 0; i <= limit; i++) {
        fn = f0 + f1
        f0 = f1
        f1 = fn
        arrayfn.push(f0)
         
    }
    
    return arrayfn //arrayfn.filter(fibn => fibn <= limit) 
    
}

console.log(fibonacci (0))

