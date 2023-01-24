<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HeaderForAll from './components/HeaderForAll.vue'
</script>

<template>
  <header>
    <div class="wrapper">
      <HeaderForAll class="headerGijon" msg="Gijón Events" />
    </div>
  </header>

      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/request">Request list</RouterLink>
      </nav>

    <RouterView />
</template>

<style lang="scss" scoped>
 
header {
  max-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
}


nav {
  width: 15em;
  height: 86%;
  margin-top: 2rem;
  background-color: rgba(227, 217, 231, 0.5);
  border-bottom: 1px solid;
  border-radius: 15px;
  align-items: center;
}

//menú del nav
nav a.router-link-exact-active {
  color: #e7e6d9;
  padding: 0.2em;
}
//hover botones nav
nav a.router-link-exact-active:hover {
  background-color: #55A06F;
}
//color y características de los botones
nav a {
  display: flex;
  justify-content: space-around;
  margin-top: 1em;
  margin-left: 0.5em;
  margin-right: 0.5em;
  margin-bottom: 0.5em;
  margin-top: 0.5em;
  border-radius: 14px;
  font-size: 1.2em;
  background-color: #33206C;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
  }

  // main  {
  //   margin-top: 35%;
  // }
 

  nav {
    text-align: left;
    font-size: 1em;
    padding: 1rem 0;
    margin-top: 1rem;
  }
  
}

@media (min-width: 768px) {
  header {
    display: flex;
    place-items: center;
  }

  nav {
    text-align: center;
    margin-left: -5%;
    font-size: 1em;
    padding: 0.5rem 0;
    margin-top: 1rem;
    height: 26rem;

  }
}
@media (max-width: 539px) {
  header {
    // display: flex;
    // place-items: center;
  }

  nav {
    // text-align: center;
    // justify-content: center;
    // align-items: center;
    font-size: 1em;
    // padding: 0.5rem 0;
    margin-left: 21%;
    margin-top: 1rem;
    height: 10em;


  }
}

</style>
