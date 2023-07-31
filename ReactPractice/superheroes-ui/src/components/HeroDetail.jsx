import React from 'react';
import images from '../index.js';
import AllHeroes from './AllHeroes';


export const HeroDetail = (props) => {
      return (
            <div>              
                    <img src={images[props.info.alias.replaceAll(/\s/g,'')]} alt={props.info.name} height="250px"/>
                        <p id="blue-alias">Alias: {props.info.alias}</p>
                        <p className="green-class">{props.info.name}</p>  
                        <p><button className="green-class">Like</button></p>  
            </div>
      )
}

export default HeroDetail
      
