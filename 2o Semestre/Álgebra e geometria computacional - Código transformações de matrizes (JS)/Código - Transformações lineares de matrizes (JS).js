class Transformations{
rotacao2D(vetor, angulo) {
    var radiano = angulo * (Math.PI / 180); // Converte graus para radianos
    var cos = Math.cos(radiano);
    var sin = Math.sin(radiano);

    // Matriz de rotação
    var MatrizDeRotacao = [[cos, sin],
                           [-sin, cos]];

    // Multiplicação da matriz pelo vetor
    var resultado = [
         MatrizDeRotacao[0][0] * vetor[0] +  MatrizDeRotacao[0][1] * vetor[1],
         MatrizDeRotacao[1][0] * vetor[0] +  MatrizDeRotacao[1][1] * vetor[1],
    ];

    return resultado;
}

rotacao3DX(vetor, angulo) {
    const radiano = angulo * (Math.PI / 180); // Converte graus para radianos
    const cos = Math.cos(radiano);
    const sin = Math.sin(radiano);

    // Matriz de rotação em torno do eixo X
    const MatrizDeRotacao = [[1,   0,   0],
                             [0, cos, -sin], 
                             [0, sin, cos]];
        

    // Multiplicação da matriz pelo vetor
    const resultado1 = [
        MatrizDeRotacao[0][0] * vetor[0] + MatrizDeRotacao[0][1] * vetor[1] + MatrizDeRotacao[0][2] * vetor[2],
        MatrizDeRotacao[1][0] * vetor[0] + MatrizDeRotacao[1][1] * vetor[1] + MatrizDeRotacao[1][2] * vetor[2],
        MatrizDeRotacao[2][0] * vetor[0] + MatrizDeRotacao[2][1] * vetor[1] + MatrizDeRotacao[2][2] * vetor[2],
    ];

    return resultado1;
}

rotacao3DY(vetor, angulo) {
    const radiano = angulo * (Math.PI / 180); // Converte graus para radianos
    const cos = Math.cos(radiano);
    const sin = Math.sin(radiano);

    // Matriz de rotação em torno do eixo Y
    const MatrizDeRotacao = [[cos, 0, sin],
                             [0,   1,   0], 
                             [-sin,0, cos]];
       

    // Multiplicação da matriz pelo vetor
    const resultado2 = [
        MatrizDeRotacao[0][0] * vetor[0] + MatrizDeRotacao[0][1] * vetor[1] + MatrizDeRotacao[0][2] * vetor[2],
        MatrizDeRotacao[1][0] * vetor[0] + MatrizDeRotacao[1][1] * vetor[1] + MatrizDeRotacao[1][2] * vetor[2],
        MatrizDeRotacao[2][0] * vetor[0] + MatrizDeRotacao[2][1] * vetor[1] + MatrizDeRotacao[2][2] * vetor[2],
    ];

    return resultado2;
}

rotacao3DZ(vetor, angulo) {
    const radiano = angulo * (Math.PI / 180); // Converte graus para radianos
    const cos = Math.cos(radiano);
    const sin = Math.sin(radiano);

    // Matriz de rotação em torno do eixo Z
    const MatrizDeRotacao = [[cos, -sin, 0],
                             [sin, cos,  0], 
                             [0,   0,   1]];
        

    // Multiplicação da matriz pelo vetor
    const resultado3 = [
        MatrizDeRotacao[0][0] * vetor[0] + MatrizDeRotacao[0][1] * vetor[1] + MatrizDeRotacao[0][2] * vetor[2],
        MatrizDeRotacao[1][0] * vetor[0] + MatrizDeRotacao[1][1] * vetor[1] + MatrizDeRotacao[1][2] * vetor[2],
        MatrizDeRotacao[2][0] * vetor[0] + MatrizDeRotacao[2][1] * vetor[1] + MatrizDeRotacao[2][2] * vetor[2],
    ];

    return resultado3;
}

reflexao2DX(vetor) {
    const [x, y] = vetor;
    return [x, -y]; // Inverte a posição de Y --- [[x],[y]] * [[1,0],[0-1]] --->>>> [[x],[-y]]
}
reflexao2DY(vetor) {
    const [x, y] = vetor;
    return [-x, y]; // Inverte a posição de X --- [[x],[y]] * [[-1,0],[0,1]] --->>>> [[-x],[y]]
}

reflexao3DX(vetor) {
    const [x, y, z] = vetor;
    return [x, -y, -z]; // Inverte Y e Z
}
    reflexao3DY(vetor) {
    const [x, y, z] = vetor;
    return [-x, y, -z]; // Inverte X e Z
}
reflexao3DZ(vetor) {
    const [x, y, z] = vetor;
    return [-x, -y, z]; // Inverte X e Y
}

projecao2DX(vetor) {
    return [vetor[0], 0]; // Projeção no eixo X
}

projecao2DY(vetor) {
    return [0, vetor[1]]; // Projeção no eixo Y
}

projecao3DX(vetor) {//                                              [1,0,0],          [x]
    return [vetor[0], 0, 0]; // Projeção no eixo X (3D)//   vetor * [0,0,0], ---->>>  [0]
}//                                                                 [0,0,0]           [0]

projecao3DY(vetor) {//                                              [0,0,0],          [0]
    return [0, vetor[1], 0]; // Projeção no eixo Y (3D)//   vetor * [0,1,0], ---->>>  [y]
}//                                                                 [0,0,0]           [0]

projecao3DZ(vetor) {//                                              [0,0,0],          [0]
    return [0, 0, vetor[2]]; // Projeção no eixo Z (3D)//   vetor * [0,0,0], ---->>>  [0]
}//                                                                 [0,0,1]           [z]


}

function main() {
const t = new Transformations()

// EXEMPLOS DE ROTAÇÕES ----------------------------------------------------------------------------------------------
console.log("ROTAÇÕES (2D e 3D):")
const vetor2D = [2, 1]; // vetor (x, y)
const vetorRotacionado2D = t.rotacao2D(vetor2D, 90); // ------->>>> coloque os parâmetros aqui (vetor2D e o ângulo)
console.log("Rotação 2D = " + "[" + vetorRotacionado2D + "]");

const vetor3DX = [1, 1, 1]; // vetor (x, y, z)
const vetorRotacionado3DX = t.rotacao3DX(vetor3DX, 90); // ------->>>> coloque os parâmetros aqui (vetor3DX e o ângulo)
console.log("Roatação 3D em X = " + "[" + vetorRotacionado3DX + "]");

const vetor3DY = [1, 1, 1]; // vetor (x, y, z)
const vetorRotacionado3DY = t.rotacao3DY(vetor3DY, 90); // ------->>>> coloque os parâmetros aqui (vetor3DY e o ângulo)
console.log("Roatação 3D em Y = " + "[" + vetorRotacionado3DY + "]");

const vetor3DZ = [1, 1, 1]; // vetor (x, y, z)
const vetorRotacionado3DZ = t.rotacao3DZ(vetor3DZ, 90); // ------->>>> coloque os parâmetros aqui (vetor3DZ e o ângulo)
console.log("Roatação 3D em Z = " + "[" + vetorRotacionado3DZ + "]");
console.log("")
//----------------------------------------------------------------------------------------------------------------------
    
//EXEMPLOS DE REFLEXÕES ------------------------------------------------------------------------------------------------
console.log("REFLEXÕES (2D e 3D):")
const vetor2Dr = [3, 4]; // --->>>> escolha o vetor 2D
console.log('Reflexão em relação ao eixo X (2D):', t.reflexao2DX(vetor2Dr));
console.log('Reflexão em relação ao eixo Y (2D):', t.reflexao2DY(vetor2Dr));

const vetor3D = [1, 2, 3]; // --->>>> escolha o vetor 3D
console.log('Reflexão em relação ao eixo X (3D):', t.reflexao3DX(vetor3D));
console.log('Reflexão em relação ao eixo Y (3D):', t.reflexao3DY(vetor3D));
console.log('Reflexão em relação ao eixo Z (3D):', t.reflexao3DZ(vetor3D));
console.log("")
//-----------------------------------------------------------------------------------------------------------------------

//EXEMPLOS DE PROJEÇÕES ------------------------------------------------------------------------------------------------
console.log("PROJEÇÕES (2D e 3D):")
const vetor2Dp = [1,5]; //--->>>> escolha o vetor (2D) aqui
console.log("A projeção do vetor " + vetor2Dp +" em relação a X (2D): " + "[" + t.projecao2DX(vetor2Dp)+ "]"); 
console.log("A projeção do vetor " + vetor2Dp +" em relação a Y (2D): " + "[" + t.projecao2DY(vetor2Dp)+ "]"); 

const vetor3Dp = [3,6,9]; // --->>>> escolha o vetor (3D) aqui
console.log("A projeção do vetor " + vetor3Dp +" em relação a X (3D): " + "[" + t.projecao3DX(vetor3Dp)+ "]"); 
console.log("A projeção do vetor " + vetor3Dp +" em relação a Y (3D): " + "[" + t.projecao3DY(vetor3Dp)+ "]"); 
console.log("A projeção do vetor " + vetor3Dp +" em relação a Z (3D): " + "[" + t.projecao3DZ(vetor3Dp)+ "]"); 
//-----------------------------------------------------------------------------------------------------------------------
}
main()
