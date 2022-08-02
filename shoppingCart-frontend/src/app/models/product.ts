export class Product {
    id: number;
    productName: string;
    productPrice: number;
    productDescription: string;
    imageUrl: string;

    constructor(id = 9999, productName = 'ss',  productPrice = 12, productDescription = 's1', imageUrl = 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Rubik%27s_cube_scrambled.svg/1200px-Rubik%27s_cube_scrambled.svg.png'){
        this.id = id
        this.productName = productName
        this.productDescription = productDescription
        this.productPrice = productPrice
        this.imageUrl = imageUrl
    }
}
