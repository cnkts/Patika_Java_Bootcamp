import React from "react";
import './App.css';
import Cards from './components/Cards';
import BarChart from './components/BarChart';
import Countries from './components/Countries';
import Header from './components/Header';


function App() {

  return (
    <div className="App_container">
     <Header />
     <Cards />
     <Countries />
     <BarChart />
    </div>
    
  );
}

export default App;
