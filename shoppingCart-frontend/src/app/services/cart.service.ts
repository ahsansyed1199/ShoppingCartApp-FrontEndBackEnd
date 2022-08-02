import { Injectable } from '@angular/core';
import { CartItem } from '../models/cart-item';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Product } from '../models/product';
@Injectable({
  providedIn: 'root'
})
export class CartService {

  private cartUrl = 'http://localhost:8080'
  constructor(private http: HttpClient) { }

  getCartItem(): Observable<CartItem[]>{
    //TODO Mapping result to cart item
    return this.http.get<CartItem[]>(`${this.cartUrl}/shopping/cart`)
  }

  addProductToCart(product: Product): Observable<any> {
    return this.http.post(`${this.cartUrl}/shopping/addCart`, product);
  }
}
