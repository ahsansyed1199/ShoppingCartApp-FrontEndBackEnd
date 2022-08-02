import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from 'src/app/models/product';

//import { productUrl } from '../config/api';


@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private apiUrl = 'http://localhost:8080'
  //TODO: Populate from an api
  //products: Product[]= [
   // new Product(1, 'Product 1', 'Nice product', 100),
    //new Product(2, 'Product 2', 'Nice product', 150),
    //new Product(3, 'Product 3', 'Nice product', 200),
    //new Product(4, 'Product 4', 'Nice product', 300),
    //new Product(5, 'Product 5', 'Nice product', 500),
  //]
  

  constructor(private http: HttpClient) { }

  getProducts(): Observable<Product[]>{
    return this.http.get<Product[]>(`${this.apiUrl}/shopping/getProducts`);
  }
}
