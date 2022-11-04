import React from 'react'
import { Home } from './pages/Home'
import { Product } from './pages/Product'
import { ProductList } from './pages/ProductList'
import { ProductList1 } from './pages/ProductList1'
import { AccessoiresList } from './pages/AccessoiresList'

import {Login} from './pages/Login';
import {Plante} from './pages/Plante';
import { Register } from './pages/Register';
import { Cart } from './pages/Cart';
import {

  BrowserRouter as Router,
  Switch,
  Route

} from "react-router-dom"

export const App = () => {
  return (
    <Router>
    
 <Switch>
 <Route exact path="/">
 <Home/>
         </Route>
 <Route path="/planteExterieur">
   {
    <ProductList />
   }
          
         </Route>
         <Route path="/planteInterieur">
   {
    <ProductList1 />
   }
          
         </Route>
         <Route path="/accessoires">
   {
    <AccessoiresList />
   }
          
         </Route>
 <Route path="/login">
 {
    <Login />
   }
         
         </Route>
 <Route path="/register">
 {
    <Register />
   }
       
         </Route>
         
         <Route path="/cart">
 {
    <Cart />
   }
       
         </Route>
         <Route path="/view">
 {
    <Plante />
   }
   </Route>

   <Route path="/card">
 {
    <Cart />
   }
   </Route>
        
 <Route path="/produit/:produitId">
           <Product />
         </Route>
 </Switch>
  
   
    </Router>

  )
}
