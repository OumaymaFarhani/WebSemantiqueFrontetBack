import React, { useState, useEffect } from "react";
import axios from 'axios';

import styled from 'styled-components'
import {popularProducts} from "../data"
import { Product } from './Product'
const Container = styled.div`
    padding: 20px;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
`;
const Title = styled.h1`
  margin: 10px;
`;
export const Products1 = () => {
    const [DataPlante, setDataPlante] = useState([]);
  useEffect(()=>{
    axios.get('http://localhost:8089/getFleuries',{})
    .then(res =>{
        setDataPlante(res.data)
    });
  },[]);
  const [DataPlante1, setDataPlante1] = useState([]);
  useEffect(()=>{
    axios.get('http://localhost:8089/getSucculentes',{})
    .then(res =>{
        setDataPlante1(res.data)
    });
  },[]);
  const [DataPlante2, setDataPlante2] = useState([]);
  useEffect(()=>{
    axios.get('http://localhost:8089/getVerte',{})
    .then(res =>{
        setDataPlante2(res.data)
    });
  },[]);
    return (
        <>
        <Container>
        <Title>FLEURIES</Title>
            {DataPlante.map((item) =>(
                <Product item={item} key={item.id} />

            ))}
            </Container>
            <Container>
            <Title>SUCCULANTES</Title>
             {DataPlante1.map((item) =>(
                <Product item={item} key={item.id} />

            ))}
            </Container>
            <Container>
            <Title>VERTES</Title>
             {DataPlante2.map((item) =>(
                <Product item={item} key={item.id} />

            ))}
        </Container>
        </>
    )
}
