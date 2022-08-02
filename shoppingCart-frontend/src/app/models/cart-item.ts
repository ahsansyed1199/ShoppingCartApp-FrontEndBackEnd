import { Product } from './product';

export class CartItem {
  id: number;
  productId: number;
  productName: string;
  qty: number;
  productPrice: number;

  constructor(id: number, productId, productName, productPrice, qty = 1) {
    this.id = id;
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.qty = qty;
  }
}
